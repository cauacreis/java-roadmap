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

    public double calcularCalorias() {
        // 1. Calcular BMR (assumindo homem)
        double bmr = (10 * peso) + (6.25 * altura) - (5 * idade) + 5;

        // 2. Definir fator de atividade com base no nível
        double fator;

        switch (nivelTreino) {
            case SEDENTARIO:
                fator = 1.2;
                break;
            case INICIANTE:
                fator = 1.375;
                break;
            case INTERMEDIARIO:
                fator = 1.55;
                break;
            case AVANCADO:
                fator = 1.725;
                break;
            case ATLETA:
                fator = 1.9;
                break;
            default:
                fator = 1.2;
        }
        System.out.println("Quantidade de calorias: " + bmr);

        // 3. Calcular TDEE
        return bmr * fator;
    }

    @Override
    public String toString() {
        return "Atleta{" +
                "nome='" + nome + '\'' +
                ", modalidadeDeTreino='" + modalidadeDeTreino + '\'' +
                ", idade=" + idade +
                ", nivelTreino=" + nivelTreino +
                ", peso=" + peso +
                ", altura=" + altura +
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
