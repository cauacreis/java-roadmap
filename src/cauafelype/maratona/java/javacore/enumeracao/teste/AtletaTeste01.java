package cauafelype.maratona.java.javacore.enumeracao.teste;

import cauafelype.maratona.java.javacore.enumeracao.dominio.Atleta;
import cauafelype.maratona.java.javacore.enumeracao.dominio.NivelTreino;

public class AtletaTeste01 {
    public static void main(String[] args) {
        Atleta pedro = new Atleta("Pedro", "Musculação", 17, NivelTreino.SEDENTARIO, 70, 175);
        pedro.calcularCalorias();
        System.out.println(pedro);
    }
}
