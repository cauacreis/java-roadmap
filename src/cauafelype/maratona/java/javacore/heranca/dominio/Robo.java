package cauafelype.maratona.java.javacore.heranca.dominio;

public abstract class Robo {
    protected String nome;
    protected int nivelBateria = 100;

    static {
        System.out.println("---- Sistema De Arena Robocode Iniciado ----");
    }

    public Robo(String nome) {
        this.nome = nome;
    }

    public abstract void atacar();

    protected final void recarregarBateria() {
        this.nivelBateria = 100;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivelBateria() {
        return nivelBateria;
    }

    public void setNivelBateria(int nivelBateria) {
        this.nivelBateria = nivelBateria;
    }
}
