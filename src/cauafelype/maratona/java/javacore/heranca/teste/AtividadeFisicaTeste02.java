package cauafelype.maratona.java.javacore.heranca.teste;

import cauafelype.maratona.java.javacore.heranca.dominio.AtividadeFisica;
import cauafelype.maratona.java.javacore.heranca.dominio.Musculacao;

public class AtividadeFisicaTeste02 {
    public static void main(String[] args) {
        System.out.println("Iniciando o programa");
        AtividadeFisica testeOrdem = new Musculacao("Força", 60, "Costas");
    }
}
