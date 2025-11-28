# Padrões de Projeto em Java: Uma Comparação

Este projeto explora a implementação de Padrões de Projeto (Design Patterns) em duas abordagens distintas, demonstrando as diferenças entre uma implementação em Java "puro" e outra utilizando os recursos do Spring Framework.

## Estrutura do Projeto

O repositório está dividido em duas pastas principais:

1. **[Java Puro](../DesignPatternsJavaPuro):**
    - **Descrição:** Implementa os padrões de projeto Singleton, Strategy, e Facade utilizando apenas recursos nativos da linguagem Java.
    - **Foco:** O objetivo desta versão é demonstrar a implementação manual e o entendimento fundamental de cada padrão.
    - **Evoluções:** O projeto foi aprimorado para incluir a combinação de padrões, como o uso do **Observer** para notificar mudanças na `Strategy` e um **Factory Method** para desacoplar a criação das estratégias.

2. **[Java Com Spring](../DesignPatternsJavaComSpring):**
    - **Descrição:** Reimplementa a mesma lógica de negócio (um CRUD de clientes com busca de CEP), mas utilizando os recursos do Spring Framework para aplicar os padrões de projeto de forma mais idiomática e produtiva.
    - **Padrões com Spring:**
        - **Singleton:** Gerenciado automaticamente pelo contêiner de Inversão de Controle (IoC) do Spring com anotações como `@Service` e `@RestController`.
        - **Strategy:** Implementado através da Injeção de Dependências (`@Autowired`), onde o `ClienteServiceImpl` delega a responsabilidade da busca de CEP para a interface `ViaCepService`.
        - **Facade:** O `ClienteServiceImpl` atua como uma Facade, orquestrando as interações entre os repositórios e o serviço externo.
        - **Observer:** Implementado de forma elegante com o sistema de eventos do Spring (`ApplicationEventPublisher` e `@EventListener`).

## Objetivo

A comparação entre as duas abordagens visa destacar como um framework moderno como o Spring pode simplificar e potencializar a aplicação de padrões de projeto, abstraindo grande parte da complexidade e do código boilerplate.
