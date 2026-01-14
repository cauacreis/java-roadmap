package cauafelype.maratona.java.introducao;

import java.util.Scanner;

public class ManipulacaoDeString {
    public static void main(String[] args) {

        String senhaCerta = "12345";

        Scanner input = new Scanner(System.in);

        System.out.println("Digite a senha do programa: ");
        String senhaInput = input.nextLine();

        System.out.println("-------------------------------------");

        if (senhaInput.equals(senhaCerta)) {
            System.out.println("Senha do programa correta!");
        }  else {
            System.out.println("Senha do programa incorreta!");
        }

        System.out.println("-------------------------------------");

        System.out.println("Agora escreva uma palavra MAIÚSCULA: ");
        String palavraMaiuscula = input.nextLine();
        System.out.println(palavraMaiuscula.toLowerCase());

        System.out.println("-------------------------------------");

        System.out.println("Agora escreva uma palavra MINÚSCULA: ");
        String palavraMinuscula = input.nextLine();
        System.out.println(palavraMinuscula.toUpperCase());
        System.out.println("-------------------------------------");

        System.out.println("Agora vamos detectar qual linguagem voce prefere: Java ou Python");
        String linguagem = input.nextLine();
        linguagem = linguagem.toLowerCase();

        if (linguagem.contains("java")) {
            System.out.println("Voce é fodão");
        }  else if (linguagem.contains("python")) {
            System.out.println("Voce não é fodão");
        }  else {
            System.out.println("Nada que você disse se encaixa na resposta.");
        }

        System.out.println("-------------------------------------");

        System.out.println("Agora vou te dizer o tamanho do seu texto: ");
        String textoTamanho = input.nextLine();

        System.out.println("Este é o tamanho do seu texto: "+textoTamanho.length());

        System.out.println("-------------------------------------");

        System.out.println("Agora escreva um texto cheio de espaços e veja a mágica: ");
        String textoEspacos = input.nextLine();

        System.out.println("Este é seu texto sem espaços no começo e no final: "+textoEspacos.trim());
        System.out.println("Este é seu texto sem espaços: "+textoEspacos.replaceAll(" ", ""));

        input.close();

    }
}
