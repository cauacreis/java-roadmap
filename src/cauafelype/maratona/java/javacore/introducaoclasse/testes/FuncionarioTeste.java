package cauafelype.maratona.java.javacore.introducaoclasse.testes;

import cauafelype.maratona.java.javacore.introducaoclasse.dominio.FuncionarioClasse;

public class FuncionarioTeste {
    public static void main(String[] args) {
        FuncionarioClasse f = new FuncionarioClasse();
        f.nome = "Maria";
        f.idade = 20;
        System.out.println("Nome do funcionario: " + f.nome);
        System.out.println("Idade do funcionario: " + f.idade);
    }
}
