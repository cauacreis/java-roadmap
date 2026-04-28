package cauafelype.maratona.java.javacore.enumeracao.teste;

import cauafelype.maratona.java.javacore.enumeracao.dominio.Compra;
import cauafelype.maratona.java.javacore.enumeracao.dominio.TipoPagamento;

public class CompraTeste01 {
    public static void main(String[] args) {
        Compra mercadoDeJaneiro = new Compra("Arroz", 25.00, TipoPagamento.PIX);
        mercadoDeJaneiro.ImprimirRecibo();
    }
}
