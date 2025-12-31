package cauafelype.maratona.java.introducao;

public class OperadoresRelacionais {
    public static void main(String[] args) {

        // Operadores básicos aritméticos + - / *

        float num1 = 1;
        float num2 = 2;
        float num3 = 3;
        float num4 = 4;
        float soma  = num3 + num4;
        System.out.println("num1 = "+num1+", num2 = "+num2);
        System.out.println("A soma dos numeros eh: "+ (num1+num2));
        System.out.println("A subtracao dos numeros eh: "+ (num2-num1));
        System.out.println("A multiplicacao dos numeros eh: "+ (num1*num2));
        System.out.println("A divisao dos numeros eh: "+ (num1/num2));
        System.out.println("A soma do num 3 e num 4 eh: "+ soma);

        // Resto %
        int  resto = 15 % 2;
        System.out.println("O resto dos numeros eh: "+resto);

        // Operadores lógicos, que retornam boolean, true ou false, sendo eles: < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezMaiorOuIgualQueVinte = 10 >= 20;
        boolean isDezMenorOuIgualQueVinte = 10 <= 20;
        boolean isDezDiferenteDeVinte = 10 != 20;
        boolean isDezIgualQueVinte = 10 == 20;
        System.out.println("Dez é maior que 20? "+ isDezMaiorQueVinte);
        System.out.println("Dez é menor que 20? "+ isDezMenorQueVinte);
        System.out.println("Dez é maior ou igual que 20? "+isDezMaiorOuIgualQueVinte);
        System.out.println("Dez é menor ou igual que 20? "+isDezMenorOuIgualQueVinte);
        System.out.println("Dez é diferente de 20? "+ isDezDiferenteDeVinte);
        System.out.println("Dez é igual a vinte? "+  isDezIgualQueVinte);
    }
}
