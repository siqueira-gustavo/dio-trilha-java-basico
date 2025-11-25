import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Banco {
    private String nome;
    private List<IConta> contas;

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public ContaCorrente criarContaCorrente(Cliente cliente) {
        ContaCorrente novaConta = new ContaCorrente(cliente);
        this.contas.add(novaConta);
        return novaConta;
    }

    public ContaPoupanca criarContaPoupanca(Cliente cliente) {
        ContaPoupanca novaConta = new ContaPoupanca(cliente);
        this.contas.add(novaConta);
        return novaConta;
    }

    public void processarContasMensalmente() {
        System.out.println("\n--- Processando rotinas mensais do banco: " + this.nome + " ---");
        for (IConta conta : contas) {
            if (conta instanceof ContaCorrente) {
                ((ContaCorrente) conta).cobrarTaxaMensal();
            } else if (conta instanceof ContaPoupanca) {
                ((ContaPoupanca) conta).aplicarRendimento();
            }
        }
        System.out.println("--- Fim do processamento mensal ---\n");
    }
}