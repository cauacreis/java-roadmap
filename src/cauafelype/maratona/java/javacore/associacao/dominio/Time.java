package cauafelype.maratona.java.javacore.associacao.dominio;

public class Time {
    private String nome;
    private jogador[] jogadores; // Associação: O Time conhece os Jogadores

    public Time(String nome) {
        this.nome = nome;
    }
    public Time() {
    }

    public void imprime() {
        System.out.println("--- Time: " + this.nome + " ---");
        if (this.jogadores != null) {
            for (jogador j : jogadores) {
                System.out.println("Jogador: " + j.getNome());
            }
        } else {
            System.out.println("Nenhum jogador cadastrado no time.");
        }
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public jogador[] getJogadores() { return jogadores; }
    public void setJogadores(jogador[] jogadores) { this.jogadores = jogadores; }
}