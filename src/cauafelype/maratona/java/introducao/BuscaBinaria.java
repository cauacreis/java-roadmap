package cauafelype.maratona.java.introducao;

import java.util.Scanner;

public class BuscaBinaria {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] numeros = new int[1000];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i;
        }

        System.out.println("Digite qual número você deseja achar no array: ");
        int numeroDoArray =  input.nextInt();

        int tamanhoDoArray = numeros.length;

        int inicio = 0;
        int fim = tamanhoDoArray - 1    ;
        int meio;
        int tentativas = 0;
        boolean achou = false;
        while (inicio <= fim) {
            tentativas++;
            meio = (inicio + fim) / 2;
            if (numeros[meio] == numeroDoArray) {
                System.out.println("Achamos o seu número: "+numeros[meio]);
                System.out.println("Em "+tentativas+" tentativas");
                achou = true;
                break;
            } else if (numeros[meio] < numeroDoArray) {
                inicio = meio + 1;
            } else if (numeros[meio] > numeroDoArray) {
                fim = meio - 1;
            }
        }
        if (!achou) {
            System.out.println("Não achamos ainda!");
        }

    }
}
