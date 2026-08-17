package cauafelype.maratona.java.devcars.dominio;

public enum TipoCombustivel {
    FLEX {
        @Override
        public double calcularDescontoAmbiental(double valorTotal) {
            return valorTotal;
        }
    },
    ELETRICO {
        @Override
        public double calcularDescontoAmbiental(double valorTotal) {
            return valorTotal * 0.90;
        }
    };

    public abstract double calcularDescontoAmbiental(double valorTotal);
}

