public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirInfosComuns();
    }

    public void aplicarRendimento() {
        final double TAXA_RENDIMENTO = 0.005; // 0.5% ao mês
        double rendimento = this.saldo * TAXA_RENDIMENTO;
        this.saldo += rendimento;
        System.out.println(String.format("Rendimento de R$ %.2f aplicado na conta %d.", rendimento, this.getNumero()));
    }
}