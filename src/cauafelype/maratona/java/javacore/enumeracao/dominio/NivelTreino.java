package cauafelype.maratona.java.javacore.enumeracao.dominio;

public enum NivelTreino {
    SEDENTARIO(0),
    INICIANTE(2),
    INTERMEDIARIO(3),
    AVANCADO(4),
    ATLETA(5);

    private int diasPorSemana;
    NivelTreino(int diasPorSemana) {
        this.diasPorSemana = diasPorSemana;
    }

    public int getDiasPorSemana() {
        return diasPorSemana;
    }

}
