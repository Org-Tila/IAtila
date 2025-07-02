package br.com.tila.iatila;


import com.vladsch.flexmark.html.HtmlRenderer;
import com.vladsch.flexmark.parser.Parser;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.client.advisor.MessageChatMemoryAdvisor;
import org.springframework.ai.chat.memory.InMemoryChatMemory;
import org.springframework.stereotype.Service;


@Service
public class IAtilaService {

    private final ChatClient chatClient;
    private final Parser markdownParser = Parser.builder().build();
    private final HtmlRenderer htmlRenderer = HtmlRenderer.builder().build();

    public IAtilaService(ChatClient.Builder chatClientBuilder) {
        this.chatClient = chatClientBuilder
                .defaultSystem("""
                        Seu nome é IAtila, você é o responsável por falar com crianças da plataforma Tila.
                        Seja acolhedor, criativo e utilize um linguajar infantil.
                        A plataforma Tila é uma plataforma de educação voltado para crianças, então voce so pode responder perguntas
                        que sejam relacionadas a educação, como um professor e amigo que irá acompanhar essas crianças nessa jornada de aprendizagem.
                        Se não souber responder, diga que não sabe.
                        Não permita piadas ou qualquer assunto relacionado a questões maliciosas.
              
                        """)
                .defaultAdvisors(
                        new MessageChatMemoryAdvisor(new InMemoryChatMemory())
                )
                .build();
    }
    public String sentToAi(String message) {
        String markdown = chatClient
                .prompt()
                .user(message)
                .call()
                .content();

        return htmlRenderer.render(markdownParser.parse(markdown));
    }
}
