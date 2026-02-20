package cauafelype.maratona.java.javacore.sobrecargametodos.dominio;

public class Anime {
    private String nome;
    private double nota;
    private String tipo;
    private int eps;
    private int temps;

    public void imprime() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Nota: " + this.nota);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Episódios: " + this.eps);
        System.out.println("Temporadas: " + this.temps);
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
