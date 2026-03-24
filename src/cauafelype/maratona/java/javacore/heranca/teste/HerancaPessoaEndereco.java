package cauafelype.maratona.java.javacore.heranca.teste;

import cauafelype.maratona.java.javacore.heranca.dominio.Endereco;
import cauafelype.maratona.java.javacore.heranca.dominio.Funcionario;
import cauafelype.maratona.java.javacore.heranca.dominio.Pessoa;

public class HerancaPessoaEndereco {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 1");
        endereco.setCep("12345");
        Pessoa pessoa = new Pessoa("Pedro", "01234567891");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        System.out.println("\n ---- Divisa funcionario ------ \n");

        Funcionario funcionario = new Funcionario("Fabricio", "01234567891", 2000);
        funcionario.setEndereco(endereco);
        funcionario.imprime();
    }
}
