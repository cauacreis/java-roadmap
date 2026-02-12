package cauafelype.maratona.java.javacore.introducaoclasse.testes;

import cauafelype.maratona.java.javacore.introducaoclasse.dominio.PessoaClasse;

public class PessoaTeste03 {
    public static void main(String[] args) {
        PessoaClasse pessoaClasse = new PessoaClasse();
        pessoaClasse.setNome("Julio");
        pessoaClasse.setIdade(18);
        pessoaClasse.setSexo('M');
        System.out.println("teste get: "+pessoaClasse.getNome());
        pessoaClasse.imprime();
    }
}
