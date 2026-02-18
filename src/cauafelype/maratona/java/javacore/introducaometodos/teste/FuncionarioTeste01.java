package cauafelype.maratona.java.javacore.introducaometodos.teste;

import cauafelype.maratona.java.javacore.introducaometodos.dominio.FuncionarioMetodo;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        FuncionarioMetodo funcionarioMetodo01 = new FuncionarioMetodo();
        FuncionarioMetodo funcionarioMetodo02 = new FuncionarioMetodo();
        funcionarioMetodo01.inicializa("Midoriya", 12, 1500, 1200, 1999);

        funcionarioMetodo02.setNome("laura");
        funcionarioMetodo02.setIdade(20);
        funcionarioMetodo02.setSalarios(new double[]{1200, 1500, 1999});

        funcionarioMetodo01.imprimir();
        funcionarioMetodo01.imprimeMediaSalarial();
        funcionarioMetodo02.imprimir();
        funcionarioMetodo02.imprimeMediaSalarial();
    }
}
