# Desafio de Controle de Fluxo

Este projeto foi desenvolvido como parte do desafio de Controle de Fluxo da trilha de Java Básico da DIO.

## Funcionalidade

O programa recebe dois números inteiros como parâmetros via terminal. A lógica do programa então verifica se o primeiro número é maior que o segundo.

- Se for, lança uma exceção customizada (`ParametrosInvalidosException`) com a mensagem "O segundo parâmetro deve ser maior que o primeiro".
- Caso contrário, o programa calcula a diferença entre os dois números e utiliza um laço `for` para imprimir no console uma contagem de 1 até essa diferença.

## Como Executar

1. Navegue até o diretório `DesafioControleFluxo/src`.
2. Compile os arquivos `.java`:

    ```bash
    javac *.java
    ```

3. Volte para o diretório `src` e execute o programa, passando os dois números como entrada quando solicitado:

    ```bash
    java Contador
    ```

## Exemplos de Uso

### Cenário 1: Parâmetros Válidos

**Entrada:**

```text
Digite o primeiro parâmetro
5
Digite o segundo parâmetro
10
```

**Saída:**

```text
Imprimindo o número 1
Imprimindo o número 2
Imprimindo o número 3
Imprimindo o número 4
Imprimindo o número 5
```

### Cenário 2: Parâmetros Inválidos

**Entrada:**

```text
Digite o primeiro parâmetro
15
Digite o segundo parâmetro
10
```

**Saída:**

```text
O segundo parâmetro deve ser maior que o primeiro
```
