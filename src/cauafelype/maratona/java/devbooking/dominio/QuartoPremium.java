package cauafelype.maratona.java.devbooking.dominio;

public class QuartoPremium extends Quarto{
    private boolean temHidromassagem;

    public QuartoPremium(int numeroQuarto, double valorDiaria, StatusQuarto statusQuarto, boolean temHidromassagem) {
        super(numeroQuarto, valorDiaria, statusQuarto);
        this.temHidromassagem = temHidromassagem;
    }

    public boolean isTemHidromassagem() {
        return temHidromassagem;
    }
}
