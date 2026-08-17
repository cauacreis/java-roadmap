package cauafelype.maratona.java.devcars;

public abstract class Veiculo {
    private String marca;
    private double valorDiaria;
    private TipoCombustivel tipoCombustivel;

    public Veiculo(String marca, double valorDiaria, TipoCombustivel tipoCombustivel) {
        this.marca = marca;
        this.valorDiaria = valorDiaria;
        this.tipoCombustivel = tipoCombustivel;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public String getMarca() {
        return marca;
    }

    public TipoCombustivel getTipoCombustivel() {
        return tipoCombustivel;
    }
}
