package cauafelype.maratona.java.javacore.introducaometodos.teste;

import cauafelype.maratona.java.javacore.introducaometodos.dominio.calculadora;
import java.util.Scanner;

public class CalculadoraTeste {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        calculadora somaDosNumeros = new calculadora();
        somaDosNumeros.somaDoisNumeros();
        System.out.println("Finalizando CalculadoraTeste");
        somaDosNumeros.subtraiDoisNumeros();
        System.out.println("Finalizando Subtracao");
        System.out.println("Me diga o primeiro número para multiplicar: ");
        int num1 = input.nextInt();
        System.out.println("Me diga o primeiro número para multiplicar: ");
        int num2 = input.nextInt();

        somaDosNumeros.multiplicaDoisNumeros(num1, num2);
        System.out.println("Finalizando Multiplicacao");
    }
}
