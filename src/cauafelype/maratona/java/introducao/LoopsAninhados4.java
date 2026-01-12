package cauafelype.maratona.java.introducao;

import java.util.Scanner;

public class LoopsAninhados4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Até qual número você quer toda a tabuada? ");
        int numero = input.nextInt();

        for (int i = 1; i <= numero; i++){
            for (int j = 1; j <= 10; j++){
                int resultado = i * j;
                System.out.printf("%d*%d = %d \n", i, j, resultado);
            }
        }

    }
}
