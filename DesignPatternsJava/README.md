# Padrões de Projeto em Java

Este projeto demonstra a implementação de alguns padrões de projeto clássicos do "Gang of Four" (GoF) em Java puro.

## Padrões Implementados

### 1. Singleton

- **O que é?** Garante que uma classe tenha apenas uma única instância e fornece um ponto de acesso global a ela.
- **Implementação:** Foi utilizado o padrão "Lazy Holder", que é uma forma thread-safe e eficiente de implementar o Singleton.

### 2. Strategy

- **O que é?** Define uma família de algoritmos, encapsula cada um deles e os torna intercambiáveis. Isso permite que o algoritmo varie independentemente dos clientes que o utilizam.
- **Implementação:** Foi criada uma interface `Comportamento` e três implementações concretas (`Normal`, `Defensivo`, `Agressivo`). A classe `Robo` atua como o contexto que pode ter seu comportamento alterado dinamicamente.

### 3. Facade

- **O que é?** Fornece uma interface unificada e simplificada para um conjunto de interfaces em um subsistema. A Facade define uma interface de nível mais alto que torna o subsistema mais fácil de usar.
- **Implementação:** Foi criado um subsistema simulado com `CrmService` e `CepApi`. A classe `Facade` simplifica a migração de um cliente, orquestrando as chamadas para esses dois serviços.

## Como Executar

1. Abra o terminal na **raiz do projeto `DesignPatternsJava`**.
2. Compile todos os arquivos `.java`:

    ```bash
    javac -d bin src/one/digitalinnovation/gof/**/*.java src/one/digitalinnovation/gof/*.java
    ```

3. Execute a classe de teste `Test`:

    ```bash
    java -cp bin one.digitalinnovation.gof.Test
