package cauafelype.maratona.java.javacore.enumeracao.dominio;

public class Atleta {
    private String nome;
    private String modalidadeDeTreino;
    private int idade;
    protected NivelTreino nivelTreino;
    private double peso;
    private double altura;

    public Atleta(String nome, String modalidadeDeTreino, int idade, NivelTreino nivelTreino, double peso, double altura) {
        this.nome = nome;
        this.modalidadeDeTreino = modalidadeDeTreino;
        this.idade = idade;
        this.nivelTreino = nivelTreino;
        this.peso = peso;
        this.altura = altura;
    }

    public void calcularCalorias() {

    }

    @Override
    public String toString() {
        return "Atleta{" +
                "nome='" + nome + '\'' +
                ", modalidadeDeTreino='" + modalidadeDeTreino + '\'' +
                ", idade=" + idade +
                ", nivelTreino=" + nivelTreino +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModalidadeDeTreino() {
        return modalidadeDeTreino;
    }

    public void setModalidadeDeTreino(String modalidadeDeTreino) {
        this.modalidadeDeTreino = modalidadeDeTreino;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public NivelTreino getNivelTreino() {
        return nivelTreino;
    }

    public void setNivelTreino(NivelTreino nivelTreino) {
        this.nivelTreino = nivelTreino;
    }
}
