package cauafelype.maratona.java.introducao;

import java.util.Scanner;

public class EstruturasDeRepeticao {
    public static void main(String[] args) {
        // do while(repete uma vez pelo menos), while(repete enquanto uma condição for true) e for(laço de repetição
        // pra quando o usuário sabe exatamente quantas vezes vai repetir

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número para ir até 0: ");
        int  numeroAteZero = leitor.nextInt();

        while (numeroAteZero >= 0) {
            System.out.println("Número atual: "+numeroAteZero);
            numeroAteZero--;
        }
        System.out.println("Programa encerrado!");

        System.out.println("Agora o segundo número para ir até 0: ");
        int numeroAteZero2 = leitor.nextInt();

        do{
            System.out.println("Seu número atual é: "+numeroAteZero2);
            numeroAteZero2--;
        } while (numeroAteZero2 >= 0);
        System.out.println("Segundo programa encerrado!");


        for (int i = 1; i<=10;i++) {
            System.out.println("número atual do contador i: "+i);
        }

// JEITO COM CONTINUE (Filtra o que NÃO quer)
        for (int a = 1; a <= 50; a++) {
            // Se for ímpar, PULA FORA!
            if (a % 2 != 0) {
                continue;
            }

            System.out.println("Par: " + a);
        }
        leitor.close();
    }
}
