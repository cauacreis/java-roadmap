package cauafelype.maratona.java.javacore.heranca.dominio;

public class RoboCombate extends Robo {
    private int poderDeFogo;

    public RoboCombate(String nome, int poderDeFogo) {
        super(nome);
        this.poderDeFogo = poderDeFogo;
    }

    @Override
    public void atacar() {
        System.out.println("O robo efetuou um ataque com poder de fogo: "+poderDeFogo+"DMG");
    }
}
