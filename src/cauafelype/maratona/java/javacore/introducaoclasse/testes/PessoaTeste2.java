package cauafelype.maratona.java.javacore.introducaoclasse.testes;

import cauafelype.maratona.java.javacore.introducaoclasse.dominio.PessoaClasse;

public class PessoaTeste2 {
    public static void main(String[] args) {
        PessoaClasse pessoa2 = new PessoaClasse();
        PessoaClasse pessoa3 = new PessoaClasse();
        pessoa3.nome = "Julio";
        System.out.println(pessoa2.idade);
        System.out.println(pessoa2.sexo);
        System.out.println(pessoa2.nome);
        System.out.println("----------------");
        System.out.println(pessoa3.idade);
        System.out.println(pessoa3.sexo);
        System.out.println(pessoa3.nome);
    }
}
