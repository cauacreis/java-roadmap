package cauafelype.maratona.java.javacore.introducaometodos.teste;

import cauafelype.maratona.java.javacore.introducaometodos.dominio.ImpressoraProfessorMetodos;
import cauafelype.maratona.java.javacore.introducaometodos.dominio.ProfessorMetodo;

public class ProfessorTeste {
    public static void main(String[] args) {
        ProfessorMetodo professorMetodo01 = new ProfessorMetodo();
        ProfessorMetodo professorMetodo02 = new ProfessorMetodo();
        ImpressoraProfessorMetodos impressora = new ImpressoraProfessorMetodos();
        // Duas variaveis professorMetodo01 e 02, que estao fazendo referência ao objeto ProfessorMetodo

        professorMetodo01.nomeProfessor = "Midoriya";
        professorMetodo01.salaProfessor = "H 202";
        professorMetodo01.sexoProfessor = 'M';
        professorMetodo01.idadeProfessor = 22;
        professorMetodo01.materiaProfessor = "Algebra";

        professorMetodo02.nomeProfessor = "Uraraka";
        professorMetodo02.salaProfessor = "H 203";
        professorMetodo02.sexoProfessor = 'M';
        professorMetodo02.idadeProfessor = 22;
        professorMetodo02.materiaProfessor = "Artes";

        System.out.println(professorMetodo01.nomeProfessor+" "+professorMetodo01.salaProfessor+" "+professorMetodo01.materiaProfessor+" "+professorMetodo01.sexoProfessor+" "+professorMetodo01.idadeProfessor);
        System.out.println("--------------");
        impressora.imprime(professorMetodo02);


    }
}
