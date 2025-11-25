public class Main {

    public static void main(String[] args) {
        // Criação do Banco
        Banco meuBanco = new Banco("Banco Digital DIO");

        // Criação de Clientes
        Cliente gustavo = new Cliente();
        gustavo.setNome("Gustavo");

        Cliente aline = new Cliente();
        aline.setNome("Aline");

        // Criação de Contas através do Banco
        System.out.println("--- Criando contas ---");
        Conta ccGustavo = meuBanco.criarContaCorrente(gustavo);
        Conta poupancaAline = meuBanco.criarContaPoupanca(aline);
        System.out.println("Contas criadas com sucesso!");

        // Operações Iniciais
        System.out.println("\n--- Realizando operações iniciais ---");
        ccGustavo.depositar(500);
        poupancaAline.depositar(1000);
        ccGustavo.transferir(150, poupancaAline);

        // Imprimindo extratos após operações iniciais
        ccGustavo.imprimirExtrato();
        poupancaAline.imprimirExtrato();

        // Demonstração da validação de saque
        System.out.println("\n--- Tentando saque com saldo insuficiente ---");
        try {
            ccGustavo.sacar(400); // Saldo é 350, vai falhar
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro ao sacar: " + e.getMessage());
        }

        System.out.println("\n--- Tentando saque com valor válido ---");
        try {
            ccGustavo.sacar(200); // Saldo é 350, vai funcionar
            System.out.println("Saque de R$ 200,00 realizado com sucesso.");
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        }
        
        // Extrato após saques
        ccGustavo.imprimirExtrato();

        // Demonstração do processamento mensal
        meuBanco.processarContasMensalmente();

        // Extratos finais
        System.out.println("--- Extratos Finais ---");
        ccGustavo.imprimirExtrato();
        poupancaAline.imprimirExtrato();
    }

}