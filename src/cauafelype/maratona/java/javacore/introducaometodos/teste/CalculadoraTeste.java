package cauafelype.maratona.java.javacore.introducaometodos.teste;

import cauafelype.maratona.java.javacore.introducaometodos.dominio.calculadora;
import java.util.Scanner;

public class CalculadoraTeste {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double num1;
        double num2;

        calculadora somaDosNumeros = new calculadora();
        somaDosNumeros.somaDoisNumeros();
        System.out.println("Finalizando CalculadoraTeste");
        somaDosNumeros.subtraiDoisNumeros();
        System.out.println("Finalizando Subtracao");
        do {
            System.out.println("Me diga o primeiro número para multiplicar: (maior que 0)");
            num1 = input.nextDouble();
            System.out.println("Me diga o segundo número para multiplicar: (maior que 0)");
            num2 = input.nextDouble();

            if (num1 == 0 || num2 == 0) {
                System.out.println("Você não pode dividir por 0!");
            }

        } while (num1 <= 0 || num2 <= 0);

        System.out.println("Essa é a multplicação desses números: "+somaDosNumeros.multiplicaDoisNumeros(num1, num2));
        System.out.println("Finalizando Multiplicacao");

        System.out.println("Essa é a divisão dos números que você escolheu: "+somaDosNumeros.divideDoisNumeros(num1, num2));

        input.close();
    }
}
