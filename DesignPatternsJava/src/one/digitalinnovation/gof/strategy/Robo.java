package one.digitalinnovation.gof.strategy;

import java.util.ArrayList;
import java.util.List;

public class Robo {

    private String nome;
    private Comportamento comportamento;
    private List<Observador> observadores = new ArrayList<>();

    public Robo(String nome) {
        this.nome = nome;
    }

    public void adicionarObservador(Observador observador) {
        this.observadores.add(observador);
    }

    public void removerObservador(Observador observador) {
        this.observadores.remove(observador);
    }

    private void notificarObservadores() {
        for (Observador observador : observadores) {
            observador.atualizar(this.nome, this.comportamento.getClass().getSimpleName());
        }
    }

    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
        notificarObservadores();
    }

    public void mover() {
        comportamento.mover();
    }
}