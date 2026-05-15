package cauafelype.maratona.java.devbooking.dominio;

public abstract class Quarto {
    private int numeroQuarto;
    private double valorDiaria;
    private StatusQuarto statusQuarto = StatusQuarto.LIVRE;


    public Quarto(int numeroQuarto, double valorDiaria, StatusQuarto statusQuarto) {
        this.numeroQuarto = numeroQuarto;
        this.valorDiaria = valorDiaria;
        this.statusQuarto = statusQuarto;
    }

    public int getNumeroQuarto() {
        return numeroQuarto;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public StatusQuarto getStatusQuarto() {
        return statusQuarto;
    }

    public void setStatusQuarto(StatusQuarto statusQuarto) {
        this.statusQuarto = statusQuarto;
    }
}
