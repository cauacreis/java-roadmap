package cauafelype.maratona.java.devbooking.dominio;

public class QuartoPremium extends Quarto{
    private boolean temHidromassagem;

    public QuartoPremium(int numeroQuarto, double valorDiaria, boolean temHidromassagem) {
        super(numeroQuarto, valorDiaria);
        this.temHidromassagem = temHidromassagem;
    }

    public boolean isTemHidromassagem() {
        return temHidromassagem;
    }
}
