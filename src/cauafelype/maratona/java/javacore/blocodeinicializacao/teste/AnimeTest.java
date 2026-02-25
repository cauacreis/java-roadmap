package cauafelype.maratona.java.javacore.blocodeinicializacao.teste;

import cauafelype.maratona.java.javacore.blocodeinicializacao.dominio.anime;

public class AnimeTest {
    public static void main(String[] args) {
        anime a = new anime("One piece");

        for (int episodios : a.getEps()) {
            System.out.println("Episodios " + episodios);
        }
    }
}
