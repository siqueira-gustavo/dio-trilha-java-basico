package one.digitalinnovation.gof.facade;

public class Facade {

    public void migrarCliente(String nome, String cep) {
        if (CrmService.clienteExiste(nome)) {
            System.out.println("Cliente " + nome + " já cadastrado. Migração não necessária.");
            return;
        }

        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}