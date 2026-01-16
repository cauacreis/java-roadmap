package cauafelype.maratona.java.introducao;

import java.util.Collections;
import java.util.Scanner;

public class OrganizadorDeNumerosSemFuncaoPronta {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] num = new int[5];

        for (int i = 0; i < 5; i++){
            System.out.println("Digite um numero: ");
            num[i] = sc.nextInt();
        }
        System.out.println("Temos esses números guardados no array: ");
        for (int i = 0; i < num.length; i++){
            System.out.print(num[i]+" ");
        }
        System.out.println("Agora eles em ordem do menor pro maior");
           for (int n = 0; n < num.length; n++){
            for (int i = 0; i < num.length - 1; i++){
                if (num[i] > num[i+1]){
                    int temp = num[i];
                    num[i] = num[i+1];
                    num[i+1] = temp;
                }
            }
            }
        System.out.println("Temos esses números guardados no array organizado: ");
        for (int j = 0; j < num.length; j++){
            System.out.print(num[j]+" ");
        }
    }
}
