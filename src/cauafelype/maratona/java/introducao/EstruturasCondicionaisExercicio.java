package cauafelype.maratona.java.introducao;

import java.util.Scanner;

public class EstruturasCondicionaisExercicio {
    public static void main(String[] args) {
        // Sistema de taxação netherland, em euro
        // 0    34,712  9.70%
        // 34,713  68,507   37.35%
        // 68,508       49.50%

        double taxacao1 = 9.70 / 100;
        double taxacao2 = 37.35 / 100;
        double taxacao3 = 49.50 / 100;
        double taxaPagar;

        Scanner leitor = new Scanner(System.in);
        System.out.println("--- Sistema de taxação NETHERLAND ---");
        System.out.println("Qual seu salário anual? ");
        double salarioAnual = leitor.nextDouble();

        if (salarioAnual <= 34712.99) {
            taxaPagar = salarioAnual * taxacao1;
        } else if (salarioAnual <= 68507.99) {
            taxaPagar = salarioAnual * taxacao2;
        } else {
            taxaPagar = salarioAnual * taxacao3;
        }
        System.out.println("-------------------------");
        System.out.println("Seu salário anual é: "+salarioAnual);
        System.out.printf("A taxa a pagar é: € %.2f %n", taxaPagar);
        System.out.println("-------------------------");
        leitor.close();
    }
}
