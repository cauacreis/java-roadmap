package cauafelype.maratona.java.javacore.annotations.desafio.dominio;

public class Cliente {
    private String nome;

    @IdadeMinima(valor = 18)
    private int idade;

    public Cliente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
