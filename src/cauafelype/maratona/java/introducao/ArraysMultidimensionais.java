package cauafelype.maratona.java.introducao;

import java.util.Scanner;

public class ArraysMultidimensionais {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Me diga, qual é a linha que você quer acessar? Limitado até o número 2: ");
        int numeroLinha = input.nextInt();
        System.out.println("Me diga, qual é a coluna que você quer acessar? Limitado até o número 11: ");
        int numeroColuna = input.nextInt();
        //o primeiro [] representa as linhas e o segundo representa as colunas
        int[][] linhasColunas = {
                {1, 7, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}, //  // índice 0
                {1, 7, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}, //  // índice 1
                {1, 7, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}  //  // índice 2
        };
        System.out.println("Estamos acessando a linha: "+numeroLinha+" || Agora o dado guardado na posição :"+numeroColuna+" || O valor guardado é: "+linhasColunas[numeroLinha][numeroColuna]);
        for (int[] linhasColuna : linhasColunas) {
            for (int i : linhasColuna) {
                System.out.println("Esses são os dados dentro dos arrays: " + i);
            }
        }
        for (int i = 0; i < linhasColunas.length; i++) {
            for (int j = 0; j < linhasColunas[i].length; j++) {
                System.out.println("Esses são os dados dentro dos arrays, segunda versão: "+linhasColunas[i][j]);
            }
        }
        input.close();
    }
}
