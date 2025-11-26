package one.digitalinnovation.gof.strategy;

public class PainelDeControle implements Observador {

    @Override
    public void atualizar(String nomeDoRobo, String novoComportamento) {
        System.out.println("[PAINEL DE CONTROLE] O robô '" + nomeDoRobo + "' mudou seu comportamento para: " + novoComportamento);
    }
}