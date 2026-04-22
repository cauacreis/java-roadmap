package cauafelype.maratona.java.javacore.sobescrita.dominio;

public class Anime {
    private String nome;

    @Override
    public String toString() {
        return nome;
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
