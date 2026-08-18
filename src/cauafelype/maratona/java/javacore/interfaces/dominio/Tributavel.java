package cauafelype.maratona.java.javacore.interfaces.dominio;

public interface Tributavel {
    // todo mundo que der implement nisso, tem que saber calcular o imposto
    double calcularImposto();
    String getDescricaoDoItem();
    default void emitirRecibo() {
        System.out.println("Emitindo recibo padrão para o governo para: "+getDescricaoDoItem());
    } //metodo q ja é definido para todas as classes q implementam Tributavel
    // mas casa aquela classe precise ser diferente, só dar um @Override
    static void imprimirRegrasDaReceita() {
        System.out.println("⚖️ REGRAS GERAIS DA RECEITA FEDERAL:");
        System.out.println("1. Todos os impostos devem ser pagos até o dia 5.");
        System.out.println("2. Sonegação resulta em multa de 200%.");
    }
}

