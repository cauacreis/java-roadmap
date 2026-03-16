package cauafelype.maratona.java.javacore.associacao.dominio;

public class jogador {
    private String nome;
    private Time time; // Associação: O Jogador conhece o Time

    public jogador(String nome) {
        this.nome = nome;
    }

    public void imprime() {
        System.out.println("Nome: " + this.nome);
        if (this.time != null) {
            System.out.println("Time: " + this.time.getNome());
        } else {
            System.out.println("Time: sem time (Jogador livre)");
        }
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public Time getTime() { return time; }
    public void setTime(Time time) { this.time = time; }
}