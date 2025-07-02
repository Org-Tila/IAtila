# Etapa 1: build com Maven
FROM eclipse-temurin:17-jdk AS build
WORKDIR /app

# Copia os arquivos do projeto
COPY . .

# Dá permissão de execução ao Maven wrapper e compila o projeto
RUN chmod +x mvnw
RUN ./mvnw clean package -DskipTests

# Etapa 2: imagem final apenas com o JAR gerado
FROM eclipse-temurin:17-jdk
WORKDIR /app

# Copia o JAR da etapa de build
COPY --from=build /app/target/*.jar app.jar

# Expõe a porta padrão do Spring Boot
EXPOSE 8080

# Comando para iniciar a aplicação
CMD ["java", "-jar", "app.jar"]