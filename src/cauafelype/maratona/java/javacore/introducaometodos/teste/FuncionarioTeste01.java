package cauafelype.maratona.java.javacore.introducaometodos.teste;

import cauafelype.maratona.java.javacore.introducaometodos.dominio.FuncionarioMetodo;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        FuncionarioMetodo funcionarioMetodo01 = new FuncionarioMetodo();
        FuncionarioMetodo funcionarioMetodo02 = new FuncionarioMetodo();
        FuncionarioMetodo funcionarioMetodo03 = new FuncionarioMetodo();

        funcionarioMetodo01.inicializa("Midoriya", 12, 1500);
        funcionarioMetodo02.inicializa("Uraraka", 12, 1400);
        funcionarioMetodo03.inicializa("Bakugo", 12, 1300);


        funcionarioMetodo01.imprimir();
        funcionarioMetodo02.imprimeMediaSalario();
    }
}
