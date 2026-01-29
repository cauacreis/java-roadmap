package cauafelype.maratona.java.javacore.introducaometodos.teste;

import cauafelype.maratona.java.javacore.introducaometodos.dominio.calculadora;

public class CalculadoraTeste {
    public static void main(String[] args) {
        calculadora somaDosNumeros = new calculadora();
        somaDosNumeros.somaDoisNumeros();
        System.out.println("Finalizando CalculadoraTeste");
        somaDosNumeros.subtraiDoisNumeros();
        System.out.println("Finalizando Subtracao");
    }
}
