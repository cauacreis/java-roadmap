package cauafelype.maratona.java.introducao;

import java.util.Scanner;

public class EstruturasCondicionaisSwitch2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("-----------------------");
        System.out.println("--- Digite seu sexo ---");
        System.out.println("-----------------------");
        String sexo = leitor.nextLine();

        switch (sexo) {
            case "M": {
                System.out.println("Masculino");
                break;
            }
            case "F": {
                System.out.println("Feminino");
                break;
            }
            default:
                System.out.println("Digite um gênero existente: 'M' ou 'F' ");
                break;
        }

    }
}
