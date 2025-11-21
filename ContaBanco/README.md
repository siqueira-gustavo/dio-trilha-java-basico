# ContaBanco

Este projeto é um simples simulador de conta bancária executado via terminal, desenvolvido como parte da trilha de Java Básico da DIO.

## Funcionalidade

O programa solicita ao usuário que insira os seguintes dados:

- Número da Agência
- Número da Conta
- Nome do Cliente
- Saldo

Após a inserção dos dados, o sistema exibe uma mensagem de confirmação com as informações fornecidas.

## Como Executar

1. Navegue até o diretório `ContaBanco/src`.
2. Compile o arquivo `ContaTerminal.java`:

   ```bash
   javac ContaTerminal.java
   ```

3. Execute o programa:

   ```bash
   java ContaTerminal
   ```

## Exemplo de Uso

Abaixo está um exemplo de como o terminal se comportará ao executar o programa:

```bash
Por favor, digite o número da Agência !
1021
Por favor, digite o número da Conta !
1234
Por favor, digite o seu nome !
MARIO ANDRADE
Por favor, digite o saldo !
237.48

Olá MARIO ANDRADE, obrigado por criar uma conta em nosso banco, sua agência é 1021, conta 1234 e seu saldo 237.48 já está disponível para saque.
```
