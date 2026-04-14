package cauafelype.maratona.java.javacore.heranca.dominio;

public abstract class AtividadeFisica {
    protected String nome;
    protected int duracaoMinutos;

    static {
        System.out.println("1- Lendo a planta de atividade física");
    }
    // cria uma regra universal para todas as classes filhas
    // significa que todas elas devem criar o metodo exibirDetalhes do jeito delas
    public abstract void exibirDetalhes();

    public AtividadeFisica(String nome, int duracaoMinutos) {
        this.nome = nome;
        this.duracaoMinutos = duracaoMinutos;
    }
    public final void aquecimentoPadrao() {
        System.out.println("Você é obrigado a fazer 5 minutos de alongamento e mobilidade!");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }
}
