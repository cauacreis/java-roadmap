package cauafelype.maratona.java.introducao;

import java.util.Scanner;

public class EstruturasCondicionaisElseIF {
    public static void main(String[] args) {

        // Boa prática: Inicializar a variável para evitar erros se o IF falhar
        String categoria = "";
        Scanner idadeVelho = new Scanner(System.in);
        System.out.println("Digite o idade: ");
        int idade = idadeVelho.nextInt();

        if (idade >= 18 && idade <= 30) {
            System.out.println("VOCÊ É ADULTO");
            categoria = "Adulto";
        } else  if (idade >= 31 && idade <= 50) {
            System.out.println("VOCÊ É UM CÔROA");
            categoria = "Côroa";
        } else  if (idade < 18) {
            System.out.println("VOCÊ NÃO É ADULTO AINDA");
            categoria = "Criança";
        } else {
            System.out.println("TA VELHO HEIN");
            categoria = "Velho";
        }
        System.out.println("Com " + idade + " anos, sua categoria é: " + categoria);
        idadeVelho.close();
    }
}
