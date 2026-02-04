package cauafelype.maratona.java.javacore.introducaometodos.dominio;

public class ProfessorMetodo {
    public int idadeProfessor;
    public char sexoProfessor;
    public String nomeProfessor;
    public String materiaProfessor;
    public String salaProfessor;

    public void imprime(){
        System.out.println("----------------");
        System.out.println(this.nomeProfessor+" "+this.materiaProfessor+" "+this.salaProfessor+" "+this.idadeProfessor+" "+this.sexoProfessor);
    }

    public void inicializa(String nomeProfessor, int idadeProfessor, char sexoProfessor, String salaProfessor, String materiaProfessor){
        this.idadeProfessor = idadeProfessor;
        this.materiaProfessor = materiaProfessor;
        this.salaProfessor = salaProfessor;
        this.nomeProfessor = nomeProfessor;
        this.sexoProfessor = sexoProfessor;
    }
}
