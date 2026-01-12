package cauafelype.maratona.java.introducao;

import java.util.Scanner;

public class LoopsAninhadosEx2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Qual o tamanho da escada do mário? ");
        int tamanho = input.nextInt();

        for(int i = 0; i < tamanho; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        input.close();
    }
}