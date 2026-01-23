package cauafelype.maratona.java.introducao;

import java.util.Scanner;

//Palindromo do jeito menos eficiente

public class Palindromo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o palíndromo: ");
        String palindromo = input.nextLine();
        char[] palindromoLetras = palindromo.toCharArray();
        int ponteiroInicial = 0;
        int ponteiroFinal = palindromo.length() - 1;

        for (int i = 0; i < palindromoLetras.length; i++) {
            System.out.println("Verificando palíndromo, letra 1: || "+palindromoLetras[ponteiroInicial]+ " || letra 2: "+palindromoLetras[ponteiroFinal]);
            if (palindromoLetras[ponteiroInicial] == palindromoLetras[ponteiroFinal]) {
                ponteiroInicial++;
                ponteiroFinal--;

            }  else {
                System.out.println("Isto não é um palíndromo! ");
                return;
            }
        }

        System.out.println("Parabéns você digitou um palíndromo");
        input.close();
    }
}
