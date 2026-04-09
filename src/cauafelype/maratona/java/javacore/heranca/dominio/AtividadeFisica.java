package cauafelype.maratona.java.javacore.heranca.dominio;

public abstract class AtividadeFisica {
    protected String nome;
    protected int duracaoMinutos;

    // cria uma regra universal pra todas as classes filhas
    // significa que todas elas devem criar o metodo exibirDetalhes do jeito delas
    public abstract void exibirDetalhes();

    public AtividadeFisica(String nome, int duracaoMinutos) {
        this.nome = nome;
        this.duracaoMinutos = duracaoMinutos;
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
