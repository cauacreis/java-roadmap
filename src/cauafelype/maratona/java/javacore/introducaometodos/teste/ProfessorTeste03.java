package cauafelype.maratona.java.javacore.introducaometodos.teste;

import cauafelype.maratona.java.javacore.introducaometodos.dominio.ProfessorMetodo;

public class ProfessorTeste03 {
    public static void main(String[] args) {
        ProfessorMetodo professorMetodo01 = new ProfessorMetodo();
        professorMetodo01.inicializa("Midoriya", 15, 'M', "H 202", "Algebra");
        professorMetodo01.imprime();
    }
}
