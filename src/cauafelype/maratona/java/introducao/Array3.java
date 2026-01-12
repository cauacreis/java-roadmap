package cauafelype.maratona.java.introducao;

public class Array3 {
    public static void main(String[] args) {
        String [] nomes = {"jose", "maria", "otavio"};
        int[] numeros = new int[3];
        int[] numeros2 = new int[]{1,2,3};
        for(String nome : nomes) {
            System.out.println("Nome: " + nome);
        }
            for(int i = 0; i < nomes.length; i++){
                System.out.println("Esses são os nomes: "+(nomes[i]));
                System.out.println("Esses são os números: "+(numeros2[i]));
            }
        }
    }
