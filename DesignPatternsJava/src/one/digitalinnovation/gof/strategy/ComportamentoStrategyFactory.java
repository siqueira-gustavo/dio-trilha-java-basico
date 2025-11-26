package one.digitalinnovation.gof.strategy;

public enum ComportamentoStrategyFactory {
    NORMAL {
        @Override
        public Comportamento getComportamento() {
            return new ComportamentoNormal();
        }
    },
    DEFENSIVO {
        @Override
        public Comportamento getComportamento() {
            return new ComportamentoDefensivo();
        }
    },
    AGRESSIVO {
        @Override
        public Comportamento getComportamento() {
            return new ComportamentoAgressivo();
        }
    };

    public abstract Comportamento getComportamento();
}