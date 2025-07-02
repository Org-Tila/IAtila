# IAtila - Inteligência Artificial da Tila 🤖📚

## Descrição do Projeto 🌈

O projeto **IAtila** é uma inteligência artificial criada especialmente para a plataforma **Tila**, com o objetivo de transformar o aprendizado das crianças em uma experiência divertida, acolhedora e educativa.  
O **IAtila** conversa com os pequenos usuários da Tila como um **professor e amigo**, sempre pronto para responder perguntas relacionadas ao conhecimento e ao mundo da educação infantil.

A **Tila** é uma plataforma digital de educação para crianças que busca incentivar o aprendizado através da tecnologia e da interação. Nossa missão é:

- 🌟 **Tornar o aprendizado divertido e acessível**
- 🧠 **Despertar a curiosidade das crianças**
- 🤗 **Criar um ambiente seguro, acolhedor e respeitoso**
- 📘 **Ensinar com responsabilidade, criatividade e empatia**
- 🚀 **Acompanhar os pequenos em cada passo da sua jornada de conhecimento**

Este é um projeto desenvolvido como parte do programa **PROA**, apresentado no **Demoday**, com a proposta de usar a tecnologia para **impactar positivamente a comunidade**, de forma **educativa, ética e responsável**.

---

## Tecnologias Utilizadas ⚙️

<div align="center">
  <img src="https://img.shields.io/badge/Java-17+-orange" alt="Java 17+">
  <img src="https://img.shields.io/badge/Vaadin-24+-8E24AA" alt="Vaadin 24+">
  <img src="https://img.shields.io/badge/Spring_Boot-3.1-green" alt="Spring Boot 3.1">
  <img src="https://img.shields.io/badge/CSS3-1572B6?logo=css3" alt="CSS3">
  <img src="https://img.shields.io/badge/OpenAI-GPT-412991" alt="OpenAI GPT">
</div>

- **Java**: Linguagem de programação utilizada no backend.
- **Vaadin**: Framework para construção da interface interativa e lúdica.
- **Spring Boot**: Backend para gerenciamento das interações e serviços.
- **CSS Personalizado**: Visual infantil, acolhedor e colorido.
- **OpenAI (GPT)**: Inteligência Artificial treinada com foco educativo e linguagem infantil.

---

## 📋 Pré-requisitos para instalação e utilização local

- ☕ **Java JDK 17 ou superior**
- 📦 **Maven 3.6+**
- 🐙 **Git**
- 🔑 **Conta na OpenAI** (para obter sua API Key)

---

## 🚀 Começando

### 1. Clonar o repositório

```bash
git clone https://github.com/seu-usuario/IAtila.git
cd IAtila
```

### 2. Configurar API Key

Acesse [OpenAI](https://platform.openai.com/) e gere sua chave de API.

Crie um arquivo `.env` com:

```properties
OPENAI_API_KEY=sua-chave-aqui
```

### 3. Construir o projeto

```bash
mvn clean install
```

### 4. Executar a aplicação

```bash
mvn spring-boot:run
```

---

🌐 Acesse no navegador:

```
http://localhost:8080
```

---

## 🛠️ Estrutura do Projeto

```
IAtila/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── br/com/tila/iatila/
│   │   │       ├── config/
│   │   │       ├── service/
│   │   │       ├── views/
│   │   │       └── IATilaApplication.java
│   │   └── resources/
│   │       ├── static/
│   │       ├── frontend/images/
│   │       └── application.properties
├── .gitignore
├── pom.xml
└── README.md
```

---

## 🤖 Funcionalidades

- 💬 **Chat infantil com IA educativa**  
- 📚 **Respostas baseadas em temas escolares e pedagógicos**
- 🧸 **Linguagem acolhedora e segura para crianças**
- ⚡ **Interface rápida e responsiva**
- 🛡️ **Proteção contra temas inapropriados ou maliciosos**

---

## 🆘 Solução de Problemas

| Problema              | Solução                                                                 |
|-----------------------|-------------------------------------------------------------------------|
| Java Version Error    | Verifique se o JDK 17+ está instalado                                   |
| API Key inválida      | Confirme se a chave está correta no `.env`                              |
| Porta 8080 ocupada    | Altere `server.port` no `application.properties`                        |
| Sem resposta da IA    | Verifique o consumo de créditos na sua conta OpenAI em `billing`        |

---

## 📄 Licença

Este projeto está licenciado sob a **MIT License**.

---

<div align="center">✨ Feito com carinho pela equipe Tila |  Se é para aprender brincando, que seja com a Tila ensinando! 🚀</div>

---

