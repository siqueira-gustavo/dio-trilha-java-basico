public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    // ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("TOCANDO MÚSICA");
    }

    @Override
    public void pausar() {
        System.out.println("MÚSICA PAUSADA");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("SELECIONANDO MÚSICA: " + musica);
    }

    // AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        System.out.println("LIGANDO PARA: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("ATENDENDO CHAMADA");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ");
    }

    // NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        System.out.println("EXIBINDO PÁGINA: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO NOVA ABA");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PÁGINA");
    }
}