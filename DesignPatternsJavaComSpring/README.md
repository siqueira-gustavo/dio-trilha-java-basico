# Padrões de Projeto com Spring Framework

Este projeto demonstra a implementação dos padrões de projeto Singleton, Strategy, e Facade, utilizando os recursos do Spring Framework.

## Padrões e Recursos do Spring

- **Singleton**: O Spring gerencia os beans (como `@Service`, `@RestController`) como Singletons por padrão, garantindo uma única instância de cada componente.
- **Strategy**: A injeção de dependências (`@Autowired`) é usada para implementar o padrão Strategy. O `ClienteServiceImpl` delega a responsabilidade de buscar o CEP para a interface `ViaCepService`, cuja implementação é fornecida pelo OpenFeign.
- **Facade**: O `ClienteServiceImpl` atua como uma Facade, simplificando a interação entre diferentes componentes (repositórios e serviços externos) para fornecer uma interface coesa para as operações de cliente.
- **Observer**: O padrão Observer foi implementado de forma elegante usando o sistema de eventos do Spring. O `ClienteServiceImpl` publica um `ClienteInseridoEvent`, e o `ClienteInseridoListener` reage a este evento de forma desacoplada.

## Como Executar

Este é um projeto Spring Boot, então você pode executá-lo de duas maneiras:

### 1. Pela Linha de Comando (usando o Gradle Wrapper)

Abra o terminal na raiz do projeto `JavaComSpring` e execute:

```bash
./gradlew bootRun
```

### 2. Pela sua IDE

A maioria das IDEs modernas (IntelliJ, VS Code com o Spring Tools, etc.) reconhecerá este como um projeto Spring Boot. Basta localizar a classe `Application` e executá-la.

A aplicação subirá na porta `8080` e você poderá interagir com a API REST que criaremos na próxima etapa.
