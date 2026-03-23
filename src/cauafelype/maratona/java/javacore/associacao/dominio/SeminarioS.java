package cauafelype.maratona.java.javacore.associacao.dominio;

public class SeminarioS {
    private String titulo;
    private AlunoS[] alunos;

    public SeminarioS(String titulo) {
        this.titulo = titulo;
    }

    public SeminarioS() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public AlunoS[] getAlunos() {
        return alunos;
    }

    public void setAlunos(AlunoS[] alunos) {
        this.alunos = alunos;
    }
}
