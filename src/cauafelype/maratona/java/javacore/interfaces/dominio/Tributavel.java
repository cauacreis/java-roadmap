package cauafelype.maratona.java.javacore.interfaces.dominio;

public interface Tributavel {
    // todo mundo que der implement nisso, tem que saber calcular o imposto
    double calcularImposto();
    String getDescricaoDoItem();
    default void emitirRecibo() {
        System.out.println("Emitindo recibo para o governo para: "+getDescricaoDoItem());
    }
}
