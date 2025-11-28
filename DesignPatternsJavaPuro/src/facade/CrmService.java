package facade;

public class CrmService {

    private CrmService() {
        super();
    }

    public static void gravarCliente(String nome, String cep, String cidade, String estado) {
        System.out.println("Cliente salvo no sistema de CRM:");
        System.out.println(nome);
        System.out.println(cep);
        System.out.println(cidade);
        System.out.println(estado);
    }

    public static boolean clienteExiste(String nome) {
        // Simula a verificação de existência do cliente
        return !nome.equals("Venilton");
    }
}