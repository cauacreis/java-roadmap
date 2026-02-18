package cauafelype.maratona.java.javacore.introducaometodos.dominio;

public class FuncionarioMetodo {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

    public void imprimir() {
        System.out.println(this.nome + " ");
        System.out.println(this.idade + " ");

        if (this.salarios != null) {
            System.out.println("Histórico de salários: ");
            for (double salario : this.salarios) {
                System.out.println(salario);
            }
        }

    }

    public void inicializa(String nome, int idade, double... salarios) {
        this.nome = nome;
        this.idade = idade;
        this.salarios = salarios;
    }

    public void imprimeMediaSalarial() {
        if (this.salarios == null) {
            System.out.println("Não possui salários! ");
            return;
        }
        double soma = 0;

        for (double salario : this.salarios) {
            soma += salario;
        }
        media = soma / this.salarios.length;
        System.out.printf("Media: %.2f",media);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia() {
        return media;
    }
}
