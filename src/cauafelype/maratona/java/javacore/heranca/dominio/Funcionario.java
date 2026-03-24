package cauafelype.maratona.java.javacore.heranca.dominio;

public class Funcionario extends Pessoa {
    // dizendo que funcionarios tem todos os atributos e metodos de uma pessoa
    private double salario;

    public Funcionario(String nome, String cpf, double salario) {
        super(nome, cpf);
        this.salario = salario;
    }

    @Override
    public void imprime() {
    super.imprime();
        System.out.println("Este é o salário do funcionário: "+this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
