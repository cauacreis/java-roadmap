package cauafelype.maratona.java.javacore.associacao.teste;

import cauafelype.maratona.java.javacore.associacao.dominio.Escola;
import cauafelype.maratona.java.javacore.associacao.dominio.Professor;

public class EscolaTeste {
    public static void main(String[] args) {
        Professor prof1 = new Professor("Maria");
        Professor prof2 = new Professor("João");
        Professor prof3 = new Professor("Marcelo");
        Professor[] professores = new Professor[]{prof1,prof2, prof3};
        Escola escola = new Escola("Colégio Estadual Artur Da Costa e Silva", professores );
        escola.imprime();
    }
}
