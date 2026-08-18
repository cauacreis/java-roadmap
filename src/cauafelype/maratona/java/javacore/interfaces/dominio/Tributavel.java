package cauafelype.maratona.java.javacore.interfaces.dominio;

public interface Tributavel {
    // todo mundo que der implement nisso, tem que saber calcular o imposto
    double calcularImposto();
    String getDescricaoDoItem();
    default String emitirRecibo() {
        System.out.println("Emitindo recibo padrão para o governo para: "+getDescricaoDoItem());
        return null;
    } //metodo q ja é definido para todas as classes q implementam Tributavel
    // mas casa aquela classe precise ser diferente, só dar um @Override
}
