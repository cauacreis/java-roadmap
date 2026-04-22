package cauafelype.maratona.java.javacore.sobescrita.dominio;

public class Anime {
    private String nome;

    @Override
    public String toString() {
        return "Anime: "+this.nome;
    }
    // esse método aparece no alt insert também, e ele tem variedades dele mesmo

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
