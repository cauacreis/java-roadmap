package cauafelype.maratona.java.javacore.introducaometodos.dominio;

public class ImpressoraProfessorMetodos {
    public void imprime(ProfessorMetodo professorMetodo) {
        System.out.println(professorMetodo.nomeProfessor + " " + professorMetodo.salaProfessor + " " + professorMetodo.materiaProfessor + " " + professorMetodo.sexoProfessor + " " + professorMetodo.idadeProfessor);

    }

    public void imprime2(ProfessorMetodo professorMetodo) {
        professorMetodo.nomeProfessor = "Maria";
        System.out.println(professorMetodo.nomeProfessor + " " + professorMetodo.salaProfessor + " " + professorMetodo.materiaProfessor + " " + professorMetodo.sexoProfessor + " " + professorMetodo.idadeProfessor);

    }

    public void imprime3(ProfessorMetodo professorMetodo) {
        System.out.println(professorMetodo.nomeProfessor + " " + professorMetodo.salaProfessor + " " + professorMetodo.materiaProfessor + " " + professorMetodo.sexoProfessor + " " + professorMetodo.idadeProfessor);
        professorMetodo.nomeProfessor = "Maria";

    }
}
