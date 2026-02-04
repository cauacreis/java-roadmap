package cauafelype.maratona.java.javacore.introducaometodos.teste;

import cauafelype.maratona.java.javacore.introducaometodos.dominio.ProfessorMetodo;

public class ProfessorTeste02 {
    public static void main(String[] args) {
        ProfessorMetodo professorMetodo01 = new ProfessorMetodo();
        ProfessorMetodo professorMetodo02 = new ProfessorMetodo();

        professorMetodo01.nomeProfessor = "Midoriya";
        professorMetodo01.salaProfessor = "H 202";
        professorMetodo01.sexoProfessor = 'M';
        professorMetodo01.idadeProfessor = 15;
        professorMetodo01.materiaProfessor = "Algebra";

        professorMetodo02.nomeProfessor = "Uraraka";
        professorMetodo02.salaProfessor = "H 203";
        professorMetodo02.sexoProfessor = 'F';
        professorMetodo02.idadeProfessor = 16;
        professorMetodo02.materiaProfessor = "Artes";

        professorMetodo01.imprime();
        professorMetodo02.imprime();
    }
}
