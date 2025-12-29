package cauafelype.maratona.java.introducao;

import java.util.Scanner;

public class scanner {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        double n1 = leitor.nextDouble();

        System.out.println("Digite outro numero: ");
        double n2 = leitor.nextDouble();

        somar(n1, n2);

        leitor.close();
    }

    public static void somar(double numeroA, double numeroB) {
        double resultado = numeroA + numeroB;
        System.out.printf("A soma é: %.2f %n", resultado);
    }
}
