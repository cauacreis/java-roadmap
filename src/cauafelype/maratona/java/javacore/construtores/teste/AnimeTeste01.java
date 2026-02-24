package cauafelype.maratona.java.javacore.construtores.teste;

import cauafelype.maratona.java.javacore.construtores.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Naruto", 10, "TV", 12, 8, "Comédia");
        anime.imprime();
    }
}
