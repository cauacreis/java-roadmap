package cauafelype.maratona.java.javacore.heranca.teste;

import cauafelype.maratona.java.javacore.heranca.dominio.Endereco;
import cauafelype.maratona.java.javacore.heranca.dominio.Funcionario;
import cauafelype.maratona.java.javacore.heranca.dominio.Pessoa;

public class HerancaPessoaEndereco {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 1");
        endereco.setCep("12345");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Maria");
        pessoa.setCpf("1234567890");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        System.out.println("\n ---- Divisa funcionario ------ \n");

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Maria");
        funcionario.setCpf("1234567890");
        funcionario.setSalario(2000);
        funcionario.setEndereco(endereco);
        funcionario.imprime();
    }
}
