# Java RESTful API com Spring Boot

Este projeto é um esqueleto básico para a criação de uma API RESTful em Java utilizando o Spring Boot. Foi gerado através do Spring Initializr e serve como ponto de partida para o desenvolvimento de serviços web REST.

## Estrutura do Projeto

O projeto segue a estrutura padrão de um projeto Spring Boot com Gradle:

- `src/main/java/me/dio/`: Contém a classe principal da aplicação.
- `src/main/resources/`: Contém arquivos de configuração, como `application.yaml`.
- `build.gradle`: Arquivo de configuração do Gradle, onde as dependências são declaradas.

## Funcionalidades Iniciais

Este projeto base inclui as configurações mínimas para iniciar uma aplicação Spring Boot:

- **Spring Web**: Para construir APIs RESTful.
- **Configuração YAML**: Utiliza `application.yaml` para configurações.

## Como Executar

1. **Pré-requisitos**: Certifique-se de ter o Java JDK 21 (ou versão compatível) e o Gradle instalados.
2. Abra o terminal na **raiz do projeto `JavaRESTfulAPI`**.
3. Execute a aplicação usando o Gradle Wrapper:

    ```bash
    ./gradlew bootRun
    ```

4. A aplicação estará disponível em `http://localhost:8080` (porta padrão).
