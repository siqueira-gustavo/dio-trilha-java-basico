# Padrões de Projeto em Java

Este projeto demonstra a implementação de alguns padrões de projeto clássicos do "Gang of Four" (GoF) em Java puro, incluindo evoluções e a combinação entre eles.

## Padrões Implementados

### 1. Singleton

- **O que é?** Garante que uma classe tenha apenas uma única instância e fornece um ponto de acesso global a ela.
- **Implementações:**
  - **Eager Initialization**: A instância é criada no momento em que a classe é carregada.
  - **Lazy Holder**: A instância é criada apenas quando o método `getInstancia()` é chamado pela primeira vez (thread-safe).
  - **Enum**: A forma mais moderna e segura, garantida pela própria JVM.

### 2. Strategy com Factory Method

- **O que são?**
  - **Strategy**: Define uma família de algoritmos, encapsula cada um deles e os torna intercambiáveis.
  - **Factory Method**: Fornece uma interface para criar objetos em uma superclasse, mas permite que as subclasses alterem o tipo de objetos que serão criados.
- **Implementação Combinada:** Para desacoplar o cliente da criação das estratégias concretas, foi criado um `Enum` (`ComportamentoStrategyFactory`) que atua como uma fábrica. Em vez de `new ComportamentoNormal()`, o cliente agora usa `ComportamentoStrategyFactory.NORMAL.getComportamento()`, centralizando a lógica de instanciação.

### 3. Facade

- **O que é?** Fornece uma interface unificada e simplificada para um conjunto de interfaces em um subsistema.
- **Implementação Evoluída:** A `Facade` `migrarCliente` foi aprimorada para verificar se um cliente já existe no subsistema de CRM antes de realizar a migração.

### 4. Observer

- **O que é?** Define uma dependência um-para-muitos entre objetos, de modo que, quando um objeto muda de estado, todos os seus dependentes são notificados.
- **Implementação:** A classe `Robo` foi transformada em um "Observável" que notifica observadores (como `PainelDeControle`) sempre que seu comportamento (Strategy) é alterado.

## Como Executar

1. Abra o terminal na **raiz do projeto `DesignPatternsJavaPuro`**.
2. Compile todos os arquivos `.java`:

    ```bash
    javac -d bin src/one/digitalinnovation/gof/**/*.java src/one/digitalinnovation/gof/*.java
    ```

3. Execute a classe de teste `Test`:

    ```bash
    java -cp bin one.digitalinnovation.gof.Test
    ```
