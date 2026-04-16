package cauafelype.maratona.java.javacore.heranca.dominio;

public class RoboCombate extends Robo {
    private int poderDeFogo;

    public RoboCombate(String nome, int poderDeFogo) {
        super(nome);
        this.poderDeFogo = poderDeFogo;
    }

    @Override
    public void carregarDados() {
        System.out.println("--- Carregando dados do robo de ataque ---");
        System.out.println("Nome: " + this.nome);
        System.out.println("Poder de Fogo: " + this.poderDeFogo);
        System.out.println("Nível de bateria: "+ this.nivelBateria);
    }

    @Override
    public void atacar() {
        System.out.println("O robo efetuou um ataque com poder de fogo: "+poderDeFogo+"DMG\n");
    }

    public int getPoderDeFogo() {
        return poderDeFogo;
    }

    public void setPoderDeFogo(int poderDeFogo) {
        this.poderDeFogo = poderDeFogo;
    }
}
