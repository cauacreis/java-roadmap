package cauafelype.maratona.java.introducao;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        long anterior = 0;
        long atual = 1;
        long proximo;

        System.out.println("Quantos números você quer ver em fibonacci? (a partir de 1)");
        int fibonnaciTamanho  = input.nextInt();

        for (int i = 0; i < fibonnaciTamanho; i++) {
            proximo = anterior + atual;
            System.out.println("Esse é o anterior: " + anterior + " || Esse é o atual: " + atual + "|| Esse é o próximo: " + proximo);
            anterior = atual;
            atual = proximo;
        }


    }
}
