package cauafelype.maratona.java.introducao;

import java.util.Scanner;

public class EstruturasCondicionaisElseIF {
    public static void main(String[] args) {

        Scanner idadeVelho = new Scanner(System.in);
        System.out.println("Digite o idade: ");
        int idade = idadeVelho.nextInt();

        if (idade >= 18 && idade <= 30) {
            System.out.println("VOCÊ É ADULTO");

        } else  if (idade >= 31 && idade <= 50) {
            System.out.println("VOCÊ É UM CÔROA");

        } else  if (idade < 18) {
            System.out.println("VOCÊ NÃO É ADULTO AINDA");

        } else {
            System.out.println("TA VELHO HEIN");

        }
    }
}
