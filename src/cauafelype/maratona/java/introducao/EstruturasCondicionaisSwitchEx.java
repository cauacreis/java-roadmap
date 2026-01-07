package cauafelype.maratona.java.introducao;

import java.util.Scanner;

public class EstruturasCondicionaisSwitchEx {
    public static void main(String[] args) {
        // Dados os valores de 1 a 7, imprima se é dia útil ou final de semana
        // Considerando 1 como domingo
        // Utilizando switch expression e switch statement

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um dia da semana, lembrando que domingo é = 1");
        byte diaDaSemana = leitor.nextByte();

        String tipoDia = switch (diaDaSemana) {
            case 2, 3, 4, 5, 6 -> "Dia útil";
            case 1, 7 -> "Dia de descansar"  ;
            default -> "Insira um dia válido (1 até 7)";
        };
        System.out.println("Hoje é um: " + tipoDia);

        switch (diaDaSemana) {
            case 1:
            case 7:
                System.out.println("Descansar");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Insira um dia da semana válido (1 até 7)");
                break;
        }

    }
}
