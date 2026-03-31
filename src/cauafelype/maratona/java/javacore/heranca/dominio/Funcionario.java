package cauafelype.maratona.java.javacore.heranca.dominio;

public class Funcionario extends Pessoa {
    // dizendo que funcionarios tem todos os atributos e metodos de uma pessoa
    private double salario;
    static {
        System.out.println("Dentro do bloco de inicialização ESTÁTICO de Funcionario");
    }
    {
        System.out.println("Dentro do bloco de inicialização de INSTÂNCIA de Funcionario");
    }
    public Funcionario(String nome, String cpf, double salario) {
        super(nome, cpf);
        System.out.println("dentro do construtor do funcionário");
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
