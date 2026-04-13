package cauafelype.maratona.java.javacore.heranca.teste;

import cauafelype.maratona.java.javacore.heranca.dominio.AtividadeFisica;
import cauafelype.maratona.java.javacore.heranca.dominio.Cardio;
import cauafelype.maratona.java.javacore.heranca.dominio.Musculacao;

public class AtividadeFisicaTeste01 {
    public static void main(String[] args) {
        AtividadeFisica cardioHoje = new Cardio("Bicicleta", 60, 12);
        AtividadeFisica musculacaoHoje = new Musculacao("Força", 60, "peito e triceps");
        AtividadeFisica[] treinoDeHoje = new AtividadeFisica[]{cardioHoje, musculacaoHoje};
        for (int i = 0; i<treinoDeHoje.length; i++) {
            treinoDeHoje[i].exibirDetalhes();
            System.out.println("------------");
        }
        System.out.println("Programa finalizado!");
        cardioHoje.aquecimentoPadrao();
    }
}
