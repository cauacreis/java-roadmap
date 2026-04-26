package cauafelype.maratona.java.javacore.enumeracao.dominio;

public enum Raridade {
    MILITAR(1.5),
    RESTRITO(3.0),
    SECRETO(5.5),
    OCULTO(10.0);

    private double multiplicadorDePreco;

    Raridade(double multiplicadorDePreco) {
        this.multiplicadorDePreco = multiplicadorDePreco;
    }

    public double getMultiplicadorDePreco() {
        return multiplicadorDePreco;
    }
}
