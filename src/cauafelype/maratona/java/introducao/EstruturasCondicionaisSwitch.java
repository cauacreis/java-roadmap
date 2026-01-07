package cauafelype.maratona.java.introducao;

import java.util.Scanner;

public class EstruturasCondicionaisSwitch {
    public static void main(String[] args) {
        // Imprima o dia da semana, considerando 1 como domingo e assim por diante, até 7.
        Scanner leitor = new Scanner(System.in);

        System.out.println("Que dia da semana é hoje? ");
        byte diaDaSemana = leitor.nextByte();

        // Vou mostrar duas maneiras de resolver esse problema:

        if (diaDaSemana == 1) {
            System.out.println("Domingo");
        } else if (diaDaSemana == 2) {
            System.out.println("Segunda");
        }  else if (diaDaSemana == 3) {
            System.out.println("Terça");
        }  else if (diaDaSemana == 4) {
            System.out.println("Quarta");
        }   else if (diaDaSemana == 5) {
            System.out.println("Quinta");
        }   else if (diaDaSemana == 6) {
            System.out.println("Sexta");
        }    else if (diaDaSemana == 7) {
            System.out.println("Sábado");
        }
        // Agora a segunda maneira
        // char, int, byte, enum, String são os tipos de varíaveis usadas nele
            switch (diaDaSemana) {
                case 1:
                    System.out.println("Hoje é Domingo");
                    break;
                case 2:
                    System.out.println("Hoje é Segunda");
                    break;
                case 3:
                    System.out.println("Hoje é Terça");
                    break;
                case 4:
                    System.out.println("Hoje é Quarta");
                    break;
                case 5:
                    System.out.println("Hoje é Quinta");
                    break;
                case 6:
                    System.out.println("Hoje é Sexta");
                    break;
                case 7:
                    System.out.println("Hoje é Sábado");
                    break;
                    default:
                        System.out.println("Opção inválida! Digite entre 1 e 7.");
                    break;
            }
        leitor.close();
    }
}
