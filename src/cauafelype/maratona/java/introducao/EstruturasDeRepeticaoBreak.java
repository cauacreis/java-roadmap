package cauafelype.maratona.java.introducao;

import java.util.Scanner;

public class EstruturasDeRepeticaoBreak {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite até quantos números você quer que apareça na tela, de 0 a 100: ");
        int numeroAteCem =  leitor.nextInt();

        for (int i = 0; i <= numeroAteCem; i++) {
            System.out.println("Este é o número atual: "+i);
        }
            for (int j = 0; j <= 200; j++) {
                System.out.println("Este for vai até 200, só que ele para no número que você disse acima: "+j);
                if(j == numeroAteCem){
                    break;
                }
            }
        }
    }

