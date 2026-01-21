package cauafelype.maratona.java.introducao;

import java.util.Scanner;

public class TabellaASCII {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String fraseParaAscii;
        System.out.println("Digite uma frase: ");
        fraseParaAscii = input.nextLine();
        System.out.println("Digite uma chave: ");
        int chave = input.nextInt();
        fraseParaAscii = fraseParaAscii.toUpperCase();
        char[] caracterArray = fraseParaAscii.toCharArray();

        for (int i = 0; i < caracterArray.length; i++) {

            if (caracterArray[i] >= 'A' && caracterArray[i] <= 'Z') {

            int novoValor = caracterArray[i] + chave;
                char novaLetra = (char)novoValor;
                if (novaLetra > 90) {
                    novaLetra = (char)(novaLetra - 26);
                }
                System.out.print(novaLetra);
                    } else {
                System.out.print(caracterArray[i]);
            }
                }
            input.close();
            }
        }
