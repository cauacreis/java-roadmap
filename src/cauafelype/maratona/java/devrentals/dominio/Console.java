package cauafelype.maratona.java.devrentals.dominio;

public class Console extends Equipamentos {
    private String geracao;

    public Console(String nome, double valorDiaria, boolean disponivel, String geracao) {
        super(nome, valorDiaria, disponivel);
        this.geracao = geracao;
    }
}
