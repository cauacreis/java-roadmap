package cauafelype.maratona.java.introducao;

import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Qual número você quer descobrir se ele é primo? ");
        int numPrimo = input.nextInt();
        int metadeDoPrimo = numPrimo / 2;
        boolean isPrimo = true;
        if (numPrimo < 2) {
            isPrimo = false;
        } else {
        for (int i = 2; i <= metadeDoPrimo; i++) {
            if (numPrimo % i == 0) {
                isPrimo = false;
                break;
                }
            }
        }
        System.out.println("Vamos descobrir agora se esse número é primo: " + isPrimo);
    }
}
