package cauafelype.maratona.java.javacore.enumeracao.teste;

import cauafelype.maratona.java.javacore.enumeracao.dominio.Raridade;
import cauafelype.maratona.java.javacore.enumeracao.dominio.SkinCS2;

public class Skincs2 {
    public static void main(String[] args) {
        SkinCS2 ak47 = new SkinCS2(199.00, "AK 47 Black Laminate", Raridade.MILITAR);
        System.out.println(ak47);
    }
}
