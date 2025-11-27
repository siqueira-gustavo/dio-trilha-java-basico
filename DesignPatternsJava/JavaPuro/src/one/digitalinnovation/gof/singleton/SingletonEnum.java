package one.digitalinnovation.gof.singleton;

/**
 * Singleton "Enum".
 * 
 * @author falvojr
 */
public enum SingletonEnum {

    INSTANCIA;

    public void imprimirValor() {
        System.out.println("Valor da instância do Enum: " + this.hashCode());
    }
}