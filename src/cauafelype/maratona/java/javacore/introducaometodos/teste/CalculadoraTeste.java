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
        System.out.println("Me diga o segundo número para multiplicar: ");
        int num2 = input.nextInt();

        System.out.println("Essa é a multplicação desses números: "+somaDosNumeros.multiplicaDoisNumeros(num1, num2));
        System.out.println("Finalizando Multiplicacao");

        System.out.println("Essa é a divisão dos números que você escolheu: "+somaDosNumeros.divideDoisNumeros(num1, num2));

        input.close();
    }
}
