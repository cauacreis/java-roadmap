package cauafelype.maratona.java.introducao;

import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {

        int [] numeros = {1, 28, 29, 12, 15, 18, 20, 24};
        int [] numeros2 = {1, 28, 29, 12, 15, 18, 20, 24};

        System.out.println("Esta é a lista de array bagunçada: "+ Arrays.toString(numeros));
        Arrays.sort(numeros2);
        System.out.println("Esta é lista de array organizada: "+ Arrays.toString(numeros2));
    }
}
