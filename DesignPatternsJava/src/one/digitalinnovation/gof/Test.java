package one.digitalinnovation.gof;

import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.singleton.SingletonEager;
import one.digitalinnovation.gof.singleton.SingletonEnum;
import one.digitalinnovation.gof.singleton.SingletonLazyHolder;
import one.digitalinnovation.gof.strategy.ComportamentoStrategyFactory;
import one.digitalinnovation.gof.strategy.Observador;
import one.digitalinnovation.gof.strategy.PainelDeControle;
import one.digitalinnovation.gof.strategy.Robo;

public class Test {

    public static void main(String[] args) {

        // Singleton
        System.out.println("--- Testes do Padrão Singleton ---");
        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println("Lazy Holder: " + lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println("Lazy Holder: " + lazyHolder);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println("Eager: " + eager);
        eager = SingletonEager.getInstancia();
        System.out.println("Eager: " + eager);

        SingletonEnum enumSingleton = SingletonEnum.INSTANCIA;
        System.out.print("Enum: ");
        enumSingleton.imprimirValor();
        enumSingleton = SingletonEnum.INSTANCIA;
        System.out.print("Enum: ");
        enumSingleton.imprimirValor();
        System.out.println();


        // Strategy com Observer
        System.out.println("--- Testes dos Padrões Strategy e Observer ---");
        Robo robo = new Robo("R2-D2");
        Observador painel = new PainelDeControle();
        robo.adicionarObservador(painel);

        robo.setComportamento(ComportamentoStrategyFactory.NORMAL.getComportamento());
        robo.mover();
        robo.setComportamento(ComportamentoStrategyFactory.DEFENSIVO.getComportamento());
        robo.mover();
        robo.setComportamento(ComportamentoStrategyFactory.AGRESSIVO.getComportamento());
        robo.mover();
        System.out.println();

        // Facade
        System.out.println("--- Testes do Padrão Facade ---");
        Facade facade = new Facade();
        facade.migrarCliente("Venilton", "14801788");
        System.out.println("--- Tentando migrar cliente já existente ---");
        facade.migrarCliente("Gustavo", "14801789");
    }
}