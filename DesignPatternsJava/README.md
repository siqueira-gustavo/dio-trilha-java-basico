# Padrões de Projeto em Java

Este projeto demonstra a implementação de alguns padrões de projeto clássicos do "Gang of Four" (GoF) em Java puro, incluindo evoluções e a combinação entre eles.

## Padrões Implementados

### 1. Singleton

- **O que é?** Garante que uma classe tenha apenas uma única instância e fornece um ponto de acesso global a ela.
- **Implementações:**
  - **Eager Initialization**: A instância é criada no momento em que a classe é carregada.
  - **Lazy Holder**: A instância é criada apenas quando o método `getInstancia()` é chamado pela primeira vez (thread-safe).
  - **Enum**: A forma mais moderna e segura, garantida pela própria JVM, à prova de reflexão e serialização.

### 2. Strategy e Observer

- **O que são?**
  - **Strategy**: Define uma família de algoritmos, encapsula cada um deles e os torna intercambiáveis.
  - **Observer**: Define uma dependência um-para-muitos entre objetos, de modo que, quando um objeto muda de estado, todos os seus dependentes são notificados e atualizados automaticamente.
- **Implementação Combinada:** A classe `Robo` (contexto da Strategy) foi evoluída para ser um "Observável". A cada mudança de comportamento (`setComportamento`), ele notifica uma lista de `Observador`es (como o `PainelDeControle`), demonstrando como os padrões podem trabalhar juntos.

### 3. Facade

- **O que é?** Fornece uma interface unificada e simplificada para um conjunto de interfaces em um subsistema.
- **Implementação Evoluída:** A `Facade` `migrarCliente` foi aprimorada para verificar se um cliente já existe no subsistema de CRM antes de realizar a migração, tornando a operação mais inteligente e evitando duplicidade.

## Como Executar

1. Abra o terminal na **raiz do projeto `DesignPatternsJava`**.
2. Compile todos os arquivos `.java`:

    ```bash
    javac -d bin src/one/digitalinnovation/gof/**/*.java src/one/digitalinnovation/gof/*.java
    ```

3. Execute a classe de teste `Test`:

    ```bash
    java -cp bin one.digitalinnovation.gof.Test
    ```

## Resultado Esperado

A execução do programa irá demonstrar cada um dos padrões, produzindo a seguinte saída:

```text
--- Testes do Padrão Singleton ---
Lazy Holder: one.digitalinnovation.gof.singleton.SingletonLazyHolder@...
Lazy Holder: one.digitalinnovation.gof.singleton.SingletonLazyHolder@...
Eager: one.digitalinnovation.gof.singleton.SingletonEager@...
Eager: one.digitalinnovation.gof.singleton.SingletonEager@...
Enum: Valor da instância do Enum: ...
Enum: Valor da instância do Enum: ...

--- Testes dos Padrões Strategy e Observer ---
[PAINEL DE CONTROLE] O robô 'R2-D2' mudou seu comportamento para: ComportamentoNormal
Movendo-se normalmente...
[PAINEL DE CONTROLE] O robô 'R2-D2' mudou seu comportamento para: ComportamentoDefensivo
Movendo-se defensivamente...
[PAINEL DE CONTROLE] O robô 'R2-D2' mudou seu comportamento para: ComportamentoAgressivo
Movendo-se agressivamente...

--- Testes do Padrão Facade ---
Cliente salvo no sistema de CRM:
Venilton
14801788
Araraquara
SP
--- Tentando migrar cliente já existente ---
Cliente Gustavo já cadastrado. Migração não necessária.
```
