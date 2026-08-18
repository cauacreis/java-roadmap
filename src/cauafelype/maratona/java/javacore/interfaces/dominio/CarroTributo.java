package cauafelype.maratona.java.javacore.interfaces.dominio;

public class CarroTributo implements Tributavel {
    private double valor;
    private String modelo;

    public CarroTributo(double valor, String modelo) {
        this.valor = valor;
        this.modelo = modelo;
    }

    @Override
    public double calcularImposto() {
        return this.valor * 0.05;
    }

    public double getValor() {
        return valor;
    }

    public String getModelo() {
        return modelo;
    }
}
