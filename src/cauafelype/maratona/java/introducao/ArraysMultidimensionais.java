package cauafelype.maratona.java.introducao;

import java.util.Scanner;

public class ArraysMultidimensionais {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Me diga, qual é a linha que você quer acessar? Limitado até o número 2: ");
        int numeroLinha = input.nextInt();
        System.out.println("Me diga, qual é a coluna que você quer acessar? Limitado até o número 11: ");
        int numeroColuna = input.nextInt();

        int[][] mesesDias = {
                {1, 7, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}, // janeiro // índice 0
                {1, 7, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}, // fevereiro // índice 1
                {1, 7, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12} // março, todos os 3 meses até o dia 12 // índice 2
        };
        System.out.println("Estamos acessando a linha: "+numeroLinha+" || Agora o dado guardado na posição :"+numeroColuna+" || O valor guardado é: "+mesesDias[numeroLinha][numeroColuna]);
        input.close();
    }
}
