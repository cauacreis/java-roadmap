package cauafelype.maratona.java.introducao;

public class EstruturasCondicionaisElseIF {
    public static void main(String[] args) {

        int idade = 10;

        if (idade >= 18 && idade <= 30) {
            System.out.println("VOCÊ É ADULTO");

        } else  if (idade >= 31 && idade <= 50) {
            System.out.println("VOCÊ É UM CÔROA");

        } else  if (idade < 18) {
            System.out.println("VOCÊ NÃO É ADULTO AINDA");

        } else {
            System.out.println("TA VELHO HEIN");

        }
    }
}
//