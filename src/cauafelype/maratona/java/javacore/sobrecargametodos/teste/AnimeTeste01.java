package cauafelype.maratona.java.javacore.sobrecargametodos.teste;

import cauafelype.maratona.java.javacore.sobrecargametodos.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        Anime anime2 = new Anime();
        anime.setEps(25);
        anime.setNome("Boku no hero");
        anime.setNota(9.8);
        anime.setTipo("Ação");
        anime.setTemps(8);

        anime2.init("Naruto", "Ação", 9.6, 365, 12);

        anime.imprime();
    }
}
