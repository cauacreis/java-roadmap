package cauafelype.maratona.java.javacore.interfaces.dominio;

public class NotebookTributo implements Tributavel {
    private double valor;
    private String modelo;

    public NotebookTributo(double valor, String modelo) {
        this.valor = valor;
        this.modelo = modelo;
    }

    public double getValor() {
        return valor;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public double calcularImposto() {
        return this.valor * 0.15;
    }

    @Override
    public String getDescricaoDoItem() {
        return this.modelo;
    }
}
