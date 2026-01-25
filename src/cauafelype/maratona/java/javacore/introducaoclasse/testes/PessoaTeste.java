package cauafelype.maratona.java.javacore.introducaoclasse.testes;

import cauafelype.maratona.java.javacore.introducaoclasse.dominio.PessoaClasse;

public class PessoaTeste {
    public static void main(String[] args) {
        PessoaClasse pessoa = new PessoaClasse();
        pessoa.idade = 20;
        pessoa.sexo = 'F';
        pessoa.nome = "Maria";
        System.out.println(pessoa.nome);
        System.out.println(pessoa.sexo);
        System.out.println(pessoa.idade);
        System.out.println(pessoa);
    }
}
