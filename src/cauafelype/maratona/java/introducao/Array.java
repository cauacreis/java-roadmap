package cauafelype.maratona.java.introducao;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        // --- PARTE 1: Inicialização ---
        // Forma Verbosa (Manual): Boa para quando você vai preencher os dados depois
        int[] idades = new int[6];
        idades[0] = 10;
        idades[1] = 20;
        idades[2] = 30; // ... imagine preencher até o fim

        // Forma Rápida (Inline): Boa para valores fixos e conhecidos
        int[] numerosDaSorte = {12, 15, 18, 20, 24};

        // --- PARTE 2: Acessando Dados ---
        System.out.println("--- Loop Clássico (Com Índice) ---");
        // Usamos quando PRECISAMOS saber a posição (ex: "O erro está na linha 3")
        for (int i = 0; i < numerosDaSorte.length; i++) {
            System.out.printf("Posição [%d] tem o valor: %d %n", i, numerosDaSorte[i]);
        }

        System.out.println("\n--- Loop Moderno (Foreach) ---");
        // Usamos quando só queremos ler os dados, sem nos importar com a posição
        for (int numero : numerosDaSorte) {
            System.out.println("Valor encontrado: " + numero);
        }

        System.out.println("\n--- O Jeito Preguiçoso (Arrays.toString) ---");
        System.out.println("Lista completa: " + Arrays.toString(numerosDaSorte));
    }
}