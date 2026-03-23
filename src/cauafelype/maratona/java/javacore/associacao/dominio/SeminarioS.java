package cauafelype.maratona.java.javacore.associacao.dominio;

public class SeminarioS {
    private String titulo;
    private AlunoS[] alunos;
    private LocalS local;

    public SeminarioS(String titulo, LocalS local) {
        this.titulo = titulo;
        this.local = local;
    }

    public SeminarioS() {
    }

    public void imprime() {
        System.out.println("Seminário: "+this.titulo);
        System.out.println("Local: "+this.local.getEndereco());
        if (this.alunos != null) {
            for (int i = 0; i < this.alunos.length; i++) {
                System.out.println("Aluno ("+i+"): "+this.alunos[i].getNome());
                }
            } else {
            System.out.println("Não há alunos inscritos nesse seminários");
        }
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
