package cauafelype.maratona.java.javacore.introducaometodos.teste;

import cauafelype.maratona.java.javacore.introducaometodos.dominio.calculadora;

import java.util.Scanner;

public class CalculadoraTeste2 {
    public static void main(String[] args) {
        calculadora calculadora = new calculadora();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        int num2 = sc.nextInt();

        calculadora.alteraDoisNumeros(num1,num2);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println("--------");
        calculadora.alteraDoisNumeros2(num1,num2);

    }
}
