public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();
    }

    public void cobrarTaxaMensal() {
        final double TAXA_MENSAL = 12.50;
        this.saldo -= TAXA_MENSAL;
        System.out.println(String.format("Taxa mensal de R$ %.2f cobrada na conta %d.", TAXA_MENSAL, this.getNumero()));
    }
}