package cauafelype.maratona.java.javacore.enumeracao.dominio;

public enum TipoPagamento {
    PIX {
        @Override
        public double calcularTaxa(double valor) {
            return valor * 0.10;
        }
    },
    CREDITO {
        @Override
        public double calcularTaxa(double valor) {
            return valor * 1.10;
        }
    },
    DEBITO{
        @Override
        public double calcularTaxa(double valor) {
            return valor;
        }
    },
    BOLETO{
        @Override
        public double calcularTaxa(double valor) {
            return valor;
        }
    },
    CHEQUE{
        @Override
        public double calcularTaxa(double valor) {
            return valor;
        }
    };

    public abstract double calcularTaxa(double valor);

}
