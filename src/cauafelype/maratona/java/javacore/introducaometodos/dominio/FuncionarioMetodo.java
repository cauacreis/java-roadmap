package cauafelype.maratona.java.javacore.introducaometodos.dominio;

public class FuncionarioMetodo {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprimir() {
        System.out.println(this.nome+" ");
        System.out.println(this.idade+" ");

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

                for  (double salario : this.salarios) {
                    soma += salario;
                }
                double media = soma / this.salarios.length;
            System.out.println("Media: " + media);
        }
}
