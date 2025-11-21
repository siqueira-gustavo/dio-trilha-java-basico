public class MeuIPhone {
    public static void main(String[] args) {
        IPhone meuIphone = new IPhone();

        System.out.println("--- Funções de Reprodutor Musical ---");
        meuIphone.selecionarMusica("U2 - Vertigo");
        meuIphone.tocar();
        meuIphone.pausar();

        System.out.println("\n--- Funções de Aparelho Telefônico ---");
        meuIphone.ligar("98765-4321");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        System.out.println("\n--- Funções de Navegador na Internet ---");
        meuIphone.exibirPagina("https://www.dio.me");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}