package cauafelype.maratona.java.devbooking.dominio;

public class QuartoStandard extends Quarto{
    private boolean vistaParaOmar;

    public QuartoStandard(int numeroQuarto, double valorDiaria, StatusQuarto statusQuarto, boolean vistaParaOmar) {
        super(numeroQuarto, valorDiaria, statusQuarto);
        this.vistaParaOmar = vistaParaOmar;
    }

    public boolean isVistaParaOmar() {
        return vistaParaOmar;
    }
}
