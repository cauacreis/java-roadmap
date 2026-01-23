package cauafelype.maratona.java.introducao;

import java.util.Scanner;

public class Palindromo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a palavra/frase: ");
        String frase = input.nextLine();

        String palindromoTratado = frase.replace(" ", "").toUpperCase();

        char[] letras = palindromoTratado.toCharArray();

        int inicio = 0;
        int fim = letras.length - 1;
        boolean ehPalindromo = true;

        while (inicio < fim) {

            if (letras[inicio] != letras[fim]) {
                ehPalindromo = false;
                break;
            }

            inicio++;
            fim--;
        }

        if (ehPalindromo) {
            System.out.println(" É UM PALÍNDROMO!");
        } else {
            System.out.println(" NÃO É PALÍNDROMO.");
        }

        input.close();
    }
}