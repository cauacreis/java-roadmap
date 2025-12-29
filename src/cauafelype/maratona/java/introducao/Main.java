package cauafelype.maratona.java.introducao;

public class Main { // Início da Classe

    // método principal
    public static void main(String[] args) {
        System.out.println("Começando o programa...");

        // Chamando outro método
        somar(10, 5);
        somar(50, 20);
        somar(110, 120);
        System.out.println("Fim.");
    }

    // método secundário
        public static void somar(int numeroA, int numeroB) {
        int resultado = numeroA + numeroB;
        System.out.println("A soma é: " + resultado);
    }

} // Fim da Classe