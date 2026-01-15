package cauafelype.maratona.java.introducao;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        int[][] cadeirasDoCinema = new int[5][5];
        int respostaMenu;
        Scanner input = new Scanner(System.in);

        System.out.println("----------------------------------");
        System.out.println("Deseja abrir o menu do cinema? True or False");
        boolean menuCinema  = input.nextBoolean();
        if (menuCinema) {
            System.out.println("Estes são os assentos disponíveis: (0 para vazias e 1 para ocupadas)");
            System.out.println("----------------------------------");

            for (int i = 0; i < cadeirasDoCinema.length; i++) {
                System.out.println();
                for (int j = 0; j < cadeirasDoCinema[i].length; j++) {
                    System.out.printf(cadeirasDoCinema[i][j] + " ");
                }
            }
        }

        do {
            System.out.println("\nDigite 1 para: Reservar Cadeira\nDigite 2 para: Cancelar reserva\nDigite 3 para sair do menu");
            System.out.println("----------------------------------");
            respostaMenu = input.nextInt();

            if  (respostaMenu == 1) {
                System.out.println("Cadastro de cadeiras do cinema: ");
                System.out.println("Selecione sua cadeira em um acervo 5 por 5: ");
                System.out.println("Digite o número da coluna: (0 a 4)");
                int coluna = input.nextInt();
                System.out.println("----------------------------------");
                System.out.println("Digite o número da linha: (0 a 4)");
                int linha = input.nextInt();
                System.out.println("----------------------------------");
                System.out.println("Sua cadeira foi reservada com sucesso");
                cadeirasDoCinema[linha][coluna] = 1;
            } else if (respostaMenu == 2) {
                System.out.println("Cadastro de cadeiras do cinema: ");
                System.out.println("Selecione sua cadeira para cancelar a reserva em um acervo 5 por 5: ");
                System.out.println("Digite o número da coluna: (0 a 4)");
                int coluna = input.nextInt();
                System.out.println("----------------------------------");
                System.out.println("Digite o número da linha: (0 a 4)");
                int linha = input.nextInt();
                System.out.println("----------------------------------");
                System.out.println("Sua cadeira foi cancelada com sucesso!");
                cadeirasDoCinema[linha][coluna] = 0;
            }
            System.out.println("Estes são os assentos disponíveis: (0 para vazias e 1 para ocupadas)");
            System.out.println("----------------------------------");

            for (int i = 0; i < cadeirasDoCinema.length; i++) {
                System.out.println();
                for (int j = 0; j < cadeirasDoCinema[i].length; j++) {
                    System.out.printf(cadeirasDoCinema[i][j] + " ");
                }
            }

        } while (respostaMenu != 3);
        System.out.println("\nPrograma finalizado com sucesso!");
    }
}
