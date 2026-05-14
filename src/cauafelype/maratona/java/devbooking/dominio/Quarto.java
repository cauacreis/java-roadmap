package cauafelype.maratona.java.devbooking.dominio;

public abstract class Quarto {
    int numeroQuarto;
    double valorDiaria;

    public Quarto(int numeroQuarto, double valorDiaria) {
        this.numeroQuarto = numeroQuarto;
        this.valorDiaria = valorDiaria;
    }

    public int getNumeroQuarto() {
        return numeroQuarto;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }
}
