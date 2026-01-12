package cauafelype.maratona.java.introducao;

import  java.util.Scanner;

public class LoopsAninhados3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o tamanho do seu quadrado: ");
        int tamanho = input.nextInt();

        for (int i = 1; i <= tamanho; i++){
            for (int j = 1; j <= tamanho; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    input.close();
    }
}
