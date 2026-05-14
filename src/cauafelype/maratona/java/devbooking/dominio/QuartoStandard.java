package cauafelype.maratona.java.devbooking.dominio;

public class QuartoStandard extends Quarto{
    private boolean vistaParaOmar;

    public QuartoStandard(int numeroQuarto, double valorDiaria,  boolean vistaParaOmar) {
        super(numeroQuarto, valorDiaria);
        this.vistaParaOmar = vistaParaOmar;
    }

    public boolean isVistaParaOmar() {
        return vistaParaOmar;
    }
}
