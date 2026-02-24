package cauafelype.maratona.java.javacore.construtores.teste;

import cauafelype.maratona.java.javacore.construtores.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Naruto", 10, "TV", 12, 8, "Comédia");
        Anime anime2 = new Anime("Boku no hero", 10, "TV", 18, 8);
        anime.imprime();
        anime2.imprime();
    }
}
