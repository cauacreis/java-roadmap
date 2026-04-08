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

    public void relatorioPagamento(){
        System.out.println("Eu: "+this.nome +", "+"Do Cpf: "+this.cpf+", "+"Confirmo que recebi:  "+this.salario+" R$, de Salário");
    }
    // só consegui criar esse metodo
    // pq os atributos são protected, ou seja,
    // quem é da família ou faz parte da herança, consegue acessar eles
    // se fosse private, eles não ia conseguir acessar, só com o get
    // se morarem em pastas diferentes vão funcionar pelo extends, sem ele, não funfa

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
