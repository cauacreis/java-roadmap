package cauafelype.maratona.java.javacore.associacao.teste;

import cauafelype.maratona.java.javacore.associacao.dominio.Time;
import cauafelype.maratona.java.javacore.associacao.dominio.jogador;

import java.util.Scanner;

public class LeituraDoTeclado01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        jogador j1 = new jogador();
        jogador j2 = new jogador();
        jogador j3 = new jogador();
        jogador[] jogadores = {j1, j2, j3};
        Time time = new Time();
        for (jogador jogador : jogadores) {
            System.out.println("Qual o nome do seu jogador: ");
            jogador.setNome(sc.nextLine());
        }
        System.out.println("Qual o nome do time dos seus jogadores? ");
        time.setNome(sc.nextLine());
        for (jogador jogadore : jogadores) {
            jogadore.setTime(time);
        }
        time.setJogadores(jogadores);

        // --- HORA DA VERDADE (IMPRIMINDO OS DOIS LADOS) ---
        System.out.println("==== VISÃO DO JOGADOR ====");
        j1.imprime();

        System.out.println("\n==== VISÃO DO TIME ====");
        time.imprime();

    }
}
