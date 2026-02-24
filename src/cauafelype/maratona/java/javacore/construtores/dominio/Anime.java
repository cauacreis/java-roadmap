package cauafelype.maratona.java.javacore.construtores.dominio;

public class Anime {
    private String nome;
    private double nota;
    private String tipo;
    private int eps;
    private int temps;
    private String genero;

// toda vez que eu iniciar um novo objeto, isso vai ser imprimido
    public Anime() {
        System.out.println("Construtor");
    }

    public void init(String nome, String tipo, double nota, int eps, int temps) {
        this.nome = nome;
        this.tipo = tipo;
        this.nota = nota;
        this.eps = eps;
        this.temps = temps;
    }
    public void init(String nome, String tipo, double nota, int eps, int temps, String genero) {
        this.init(nome, tipo, nota, eps, temps);
        this.genero = genero;
    }
    public void imprime() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Nota: " + this.nota);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Episódios: " + this.eps);
        System.out.println("Temporadas: " + this.temps);
        if (this.genero != null) {
            System.out.println("Genero: " + this.genero);
        } else {
            System.out.println("Não foi cadastrado o gênero desse anime");
        }
        System.out.println("------------------------------");
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEps() {
        return eps;
    }

    public void setEps(int eps) {
        this.eps = eps;
    }

    public int getTemps() {
        return temps;
    }

    public void setTemps(int temps) {
        this.temps = temps;
    }
}
