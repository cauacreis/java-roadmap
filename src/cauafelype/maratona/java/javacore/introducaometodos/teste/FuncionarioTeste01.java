package cauafelype.maratona.java.javacore.introducaometodos.teste;

import cauafelype.maratona.java.javacore.introducaometodos.dominio.FuncionarioMetodo;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        FuncionarioMetodo funcionarioMetodo01 = new FuncionarioMetodo();
        funcionarioMetodo01.inicializa("Midoriya", 12, 1500, 1200, 1999);

        funcionarioMetodo01.imprimir();
        funcionarioMetodo01.imprimeMediaSalarial();
    }
}
