package cauafelype.maratona.java.javacore.sobrecargametodos.teste;

import cauafelype.maratona.java.javacore.sobrecargametodos.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.setEps(25);
        anime.setNome("Boku no hero");
        anime.setNota(9.8);
        anime.setTipo("Ação");
        anime.setTemps(8);

        anime.imprime();
    }
}
