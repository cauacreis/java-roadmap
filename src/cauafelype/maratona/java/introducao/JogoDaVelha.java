package cauafelype.maratona.java.introducao;

import java.util.Scanner;

public class JogoDaVelha {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] espacosVazios = {
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        };

        int jogadorAtual = 1;
        boolean ganhou = false;
        int jogadas = 0;

        System.out.println("--- JOGO DA VELHA ---");

        while (!ganhou && jogadas < 9) {

            for (int[] espacosVazio : espacosVazios) {
                for (int i : espacosVazio) {
                    char simbolo = (i == 0) ? ' ' : (char) (i + '0');
                    System.out.print(" | " + simbolo);
                }
                System.out.println(" |");
            }

            System.out.println("\nVEZ DO JOGADOR " + jogadorAtual);
            System.out.print("Linha (0-2): ");
            int linha = input.nextInt();
            System.out.print("Coluna (0-2): ");
            int coluna = input.nextInt();

            if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2) {
                System.out.println(" Posição inválida! Use números de 0 a 2.");
                continue;
            }

            if (espacosVazios[linha][coluna] != 0) {
                System.out.println("Lugar ocupado! Tente novamente.");
                continue;
            }

            espacosVazios[linha][coluna] = jogadorAtual;
            jogadas++;

            // Linhas e Colunas
            for (int i = 0; i < 3; i++) {
                if (espacosVazios[i][0] == jogadorAtual && espacosVazios[i][1] == jogadorAtual && espacosVazios[i][2] == jogadorAtual) ganhou = true;
                if (espacosVazios[0][i] == jogadorAtual && espacosVazios[1][i] == jogadorAtual && espacosVazios[2][i] == jogadorAtual) ganhou = true;
            }
            // Diagonais
            if ((espacosVazios[0][0] == jogadorAtual && espacosVazios[1][1] == jogadorAtual && espacosVazios[2][2] == jogadorAtual) ||
                    (espacosVazios[0][2] == jogadorAtual && espacosVazios[1][1] == jogadorAtual && espacosVazios[2][0] == jogadorAtual)) {
                ganhou = true;
            }

            // 7. Decisão: Ganhou ou Troca?
            if (ganhou) {
                System.out.println("\nPARABÉNS! O JOGADOR " + jogadorAtual + " VENCEU!");
            } else {
                // Troca o jogador: Se era 1 vira 2, se era 2 vira 1
                jogadorAtual = (jogadorAtual == 1) ? 2 : 1;
            }
        }

        if (!ganhou) {
            System.out.println("\nDEU VELHA! Ninguém ganhou.");
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) System.out.print(" | " + espacosVazios[i][j]);
            System.out.println(" |");
        }
    }
}