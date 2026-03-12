package cauafelype.maratona.java.javacore.associacao.teste;

import cauafelype.maratona.java.javacore.associacao.dominio.jogador;

public class jogadorTeste {
    public static void main(String[] args) {
        jogador jogador1 = new jogador("Pablo Escobar");
        jogador jogador2 = new jogador("Menegate");
        jogador jogador3 = new jogador("pelé");
        jogador[] jogadores = {jogador1, jogador2, jogador3}; // posicao 0 pro jogador 1 e assim sucessivamente
    }
}
