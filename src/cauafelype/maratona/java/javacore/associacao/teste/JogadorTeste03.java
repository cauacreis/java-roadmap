package cauafelype.maratona.java.javacore.associacao.teste;

import cauafelype.maratona.java.javacore.associacao.dominio.Time;
import cauafelype.maratona.java.javacore.associacao.dominio.jogador;

public class JogadorTeste03 {
    public static void main(String[] args) {
        // 1. Cria os indivíduos
        jogador j1 = new jogador("Cafu");
        jogador j2 = new jogador("Pelé");
        jogador j3 = new jogador("Neymar");
        Time time = new Time("Brasil");

        // 2. Faz o Array
        jogador[] jogadores = {j1, j2, j3};

        // 3. LIGAÇÃO DIREÇÃO 1: O Time recebe os jogadores
        time.setJogadores(jogadores);

        // 4. LIGAÇÃO DIREÇÃO 2: Cada jogador assina o contrato com o Time
        j1.setTime(time);
        j2.setTime(time);
        j3.setTime(time);

        // --- HORA DA VERDADE (IMPRIMINDO OS DOIS LADOS) ---
        System.out.println("==== VISÃO DO JOGADOR ====");
        j1.imprime();

        System.out.println("\n==== VISÃO DO TIME ====");
        time.imprime();
    }
}