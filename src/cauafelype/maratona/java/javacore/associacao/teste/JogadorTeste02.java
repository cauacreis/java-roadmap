package cauafelype.maratona.java.javacore.associacao.teste;

import cauafelype.maratona.java.javacore.associacao.dominio.Time;
import cauafelype.maratona.java.javacore.associacao.dominio.jogador;

public class JogadorTeste02 {
    public static void main(String[] args) {
        jogador j1 = new jogador("Pelé");
        Time t1 = new Time("Seleção Brasileira");
        j1.setTime(t1);
        j1.imprime();
    }
}
