package cauafelype.maratona.java.javacore.enumeracao.dominio;

public class TipoPagamento {
    PIX {
        @Override
        public double calcularTaxa(double valor) {
            return valor * 0.10;
        }
    }
    CREDITO {

    }
    DEBITO{

    }
    BOLETO{

    }
    CHEQUE{

    }
}
