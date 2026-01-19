package cauafelype.maratona.java.introducao;

import java.util.Scanner;

public class NotasEscolares {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double somaDasNotas = 0;

        System.out.println("Quantas notas você vai digitar? ");
        int tamanhoDasNotas = input.nextInt();

        double[] notas = new double[tamanhoDasNotas];

        for (int i = 0; i < notas.length; i++){
            System.out.println("Digite uma nota: ");
            notas[i] = input.nextDouble();
            somaDasNotas = somaDasNotas + notas[i];
            System.out.println("Esta é a soma total até agora: "+somaDasNotas);
        }

        double mediaDasNotas = 0;
        mediaDasNotas = somaDasNotas / notas.length;
        System.out.println("Esta é a média das notas: "+mediaDasNotas);

        double maiorNota = notas[0];
        double menorNota = notas[0];

        for(int j = 0; j < notas.length; j++){
            if(notas[j] < menorNota){
                menorNota = notas[j];
            }
            if(notas[j] >  maiorNota){
                maiorNota = notas[j];
            }
        }
        System.out.println("Esta foi a maior nota: "+maiorNota);
        System.out.println("Esta foi a menor nota: "+menorNota);

        input.close();
    }
}
