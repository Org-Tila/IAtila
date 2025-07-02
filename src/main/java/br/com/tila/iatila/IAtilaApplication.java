package br.com.tila.iatila;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
        exclude = {
                org.springframework.cloud.function.context.config.ContextFunctionCatalogAutoConfiguration.class
        }
)
public class IAtilaApplication {
    public static void main(String[] args) {
        SpringApplication.run(IAtilaApplication.class, args);
    }
}
