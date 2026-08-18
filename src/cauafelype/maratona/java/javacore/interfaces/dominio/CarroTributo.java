package cauafelype.maratona.java.javacore.interfaces.dominio;

public class CarroTributo implements Tributavel, SistemaSeguravel {
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

    @Override
    public String getDescricaoDoItem() {
        return this.modelo;
    }

    public double getValor() {
        return valor;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public double calcularSeguro() {
        return valor * 0.02;
    }

    @Override
    public String emitirRecibo() {
        return "Emitindo recibo carro: "+getModelo()+"\nDo valor: R$"+getValor();
    }
}
