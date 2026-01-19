package cauafelype.maratona.java.introducao;

import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--------------------------------");
        System.out.println("      CAIXA ELETRÔNICO JAVA     ");
        System.out.println("--------------------------------");
        System.out.print("Quanto você deseja sacar? R$ ");
        int saque = input.nextInt();

        // 1. Notas de 100
        int notasDe100 = saque / 100;
        saque = saque % 100; // Atualiza o saque com o que sobrou pro beta (Resto)

        // 2. Notas de 50
        int notasDe50 = saque / 50;
        saque %= 50; // "saque %= 50" é o mesmo que "saque = saque % 50"

        // 3. Notas de 20
        int notasDe20 = saque / 20;
        saque %= 20;

        // 4. Notas de 10
        int notasDe10 = saque / 10;
        saque %= 10;

        // 5. Notas de 5
        int notasDe5 = saque / 5;
        saque %= 5;

        // 6. Notas de 2
        int notasDe2 = saque / 2;
        saque %= 2; // O que sobrar aqui (1 ou 0) vira moeda de 1 real

        System.out.println("\n--------------------------------");
        System.out.println("        SAQUE REALIZADO         ");
        System.out.println("--------------------------------");

        if (notasDe100 > 0) System.out.println(notasDe100 + " notas de R$ 100,00");
        if (notasDe50 > 0)  System.out.println(notasDe50  + " notas de R$ 50,00");
        if (notasDe20 > 0)  System.out.println(notasDe20  + " notas de R$ 20,00");
        if (notasDe10 > 0)  System.out.println(notasDe10  + " notas de R$ 10,00");
        if (notasDe5 > 0)   System.out.println(notasDe5   + " notas de R$ 5,00");
        if (notasDe2 > 0)   System.out.println(notasDe2   + " notas de R$ 2,00");

        if (saque > 0)      System.out.println(saque      + " moedas de R$ 1,00");

        System.out.println("--------------------------------");

        input.close();
    }
}