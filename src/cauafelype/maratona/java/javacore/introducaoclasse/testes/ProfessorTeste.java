package cauafelype.maratona.java.javacore.introducaoclasse.testes;

import cauafelype.maratona.java.javacore.introducaoclasse.dominio.ProfessorClasse;

public class ProfessorTeste {
    public static void main(String[] args) {
        ProfessorClasse professor1 = new ProfessorClasse();
        professor1.idadeProfessor = 32;
        professor1.sexoProfessor = 'M';
        professor1.nomeProfessor = "João";
        professor1.materiaProfessor = "Historia";
        professor1.salaProfessor = "202 B";

        System.out.println(professor1.idadeProfessor);
        System.out.println(professor1.sexoProfessor);
        System.out.println(professor1.nomeProfessor);
        System.out.println(professor1.materiaProfessor);
        System.out.println(professor1.salaProfessor);
        System.out.println("------------");
        System.out.println(professor1.nomeProfessor+" "+professor1.salaProfessor+" "+professor1.materiaProfessor+" "+professor1.sexoProfessor+" "+professor1.idadeProfessor);
    }
}
