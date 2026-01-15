package cauafelype.maratona.java.introducao;

import java.util.Scanner;

public class BatalhaNaval {
    public static void main(String[] args) {

        int naviosColocados = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Quantos navios você quer na sua batalha? ");
        System.out.println("----------------------------------");

        int quantNavios = input.nextInt();

        int[][] posicaoNavios = new int[5][5];
        String[][] ondasDoMar = {
                {"~","~","~","~","~"},
                {"~","~","~","~","~"},
                {"~","~","~","~","~"},
                {"~","~","~","~","~"},
                {"~","~","~","~","~"},

        };


        System.out.println("----------------------------------");
        System.out.println("Deseja iniciar o jogo? True or False");
        System.out.println("----------------------------------");
        boolean iniciarJogo  = input.nextBoolean();
        if (iniciarJogo) {
            System.out.println("Este é o mar, com posições de coluna e linha de 0 a 4: ");
            System.out.println("----------------------------------");
            for (int i = 0; i < ondasDoMar.length; i++) {
                System.out.println();
                for (int j = 0; j < ondasDoMar.length; j++) {
                    System.out.printf(" |" + ondasDoMar[i][j] + " | ");
                }
            }
            while (naviosColocados < quantNavios) {
                int linhaAleatoria = (int) (Math.random() * 5);
                int colunaAleatoria = (int) (Math.random() * 5);
                    if (posicaoNavios[linhaAleatoria][colunaAleatoria] == 0) {
                        posicaoNavios[linhaAleatoria][colunaAleatoria] = 1;
                        naviosColocados++;
                    }
            }


            System.out.println("\n----------------------------------");
            System.out.println("Várias posições ocupadas, há: "+quantNavios+" navios! Mire em algum lugar para ver se você dá a sorte!");

            do {
                System.out.println("Primeiro diga a linha de ataque: ");
                int linhaDeAtaque = input.nextInt();
                System.out.println("Agora a coluna: ");
                int colunaDeAtaque = input.nextInt();
                System.out.println("Agora vamos verificar se você acertou: ");
                    if (posicaoNavios[linhaDeAtaque][colunaDeAtaque] == 1) {
                        System.out.println("Você acertou um navio BOOOMMM");
                        ondasDoMar[linhaDeAtaque][colunaDeAtaque] = "X";
                        posicaoNavios[linhaDeAtaque][colunaDeAtaque] = 2;
                        for (int i = 0; i < ondasDoMar.length; i++) {
                            System.out.println();
                            for (int j = 0; j < ondasDoMar.length; j++) {
                                System.out.printf(" |" + ondasDoMar[i][j] + " | ");
                            }
                        }
                        System.out.println("\nVocê deu sorte, que ótimo! Tente novamente");
                        System.out.println("\nVocê deseja continuar o desafio? Ou quer desistir?");
                        System.out.println("1 PARA CONTINUAR || 0 PARA DESISTIR");
                        int sairOuContinuar = input.nextInt();
                        if (sairOuContinuar == 1) {
                            System.out.println("Vamos continuar então!");
                        } else if (sairOuContinuar == 0) {
                            System.out.println("Obrigado por testar nosso jogo!");
                            return;
                        }

                        quantNavios--;
                    } else if (posicaoNavios[linhaDeAtaque][colunaDeAtaque] == 0) {
                        System.out.println("\nVocê não deu sorte, que pena! Tente novamente");
                        ondasDoMar[linhaDeAtaque][colunaDeAtaque] = "*";
                        posicaoNavios[linhaDeAtaque][colunaDeAtaque] = 2;
                        for (int i = 0; i < ondasDoMar.length; i++) {
                            System.out.println();
                            for (int j = 0; j < ondasDoMar.length; j++) {
                                System.out.printf(" |" + ondasDoMar[i][j] + " | ");
                            }
                        }
                        System.out.println("\nVocê deseja continuar o desafio? Ou quer desistir?");
                        System.out.println("1 PARA CONTINUAR || 0 PARA DESISTIR");
                        int sairOuContinuar = input.nextInt();
                        if (sairOuContinuar == 1) {
                            System.out.println("Vamos continuar então!");
                        } else if (sairOuContinuar == 0) {
                            System.out.println("Obrigado por testar nosso jogo!");
                            return;
                        }
                    } else if (posicaoNavios[linhaDeAtaque][colunaDeAtaque] == 2) {
                        System.out.println("Você já atirou aqui, tente novamente em outra posição!");
                    }

            } while (quantNavios > 0);
            System.out.println("Você conseguiu concluir o desafio! Parabéns meu marujo");
        }
        System.out.println("Obrigado!");
    }
}