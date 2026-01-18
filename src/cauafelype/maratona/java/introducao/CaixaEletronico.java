package cauafelype.maratona.java.introducao;
        import java.util.Scanner;
public class CaixaEletronico {
    public static void main(String[] args) {
        int notasDe50, notasDe100, notasDe10, notasDe20, notasDe2, notasDe5;
        Scanner input = new Scanner(System.in);
        System.out.println("Quanto você deseja sacar? ");
        int saque = input.nextInt();

        notasDe100 = saque / 100;
        System.out.println("Você receberá "+notasDe100+" notas de 100");
        notasDe100 = saque % 100;
        System.out.println("Essa é a quantidade restante: "+notasDe100);

        notasDe50 = notasDe100 / 50;
        System.out.println("Você receberá "+notasDe50+" notas de 50");
        notasDe50 = notasDe100 % 50;
        System.out.println("Essa é a quantidade restante: "+notasDe50);

        notasDe20 = notasDe50 / 20;
        System.out.println("Você receberá "+notasDe20+" notas de 20");
        notasDe20 = notasDe50 % 20;
        System.out.println("Essa é a quantidade restante: "+notasDe20);

        notasDe10 = notasDe20 / 10;
        System.out.println("Você receberá "+notasDe10+" notas de 10");
        notasDe10 = notasDe20 % 10;
        System.out.println("Essa é a quantidade restante: "+notasDe10);

        notasDe5 = notasDe10 / 5;
        System.out.println("Você receberá "+notasDe5+" notas de 5");
        notasDe5 = notasDe10 % 5;
        System.out.println("Essa é a quantidade restante: "+notasDe5);

        notasDe2 = notasDe5 / 2;
        System.out.println("Você receberá "+notasDe2+" notas de 2");
        notasDe2 = notasDe5 % 2;
        System.out.println("Essa é a quantidade restante que você receberá em moedas de 1 real: "+notasDe2);
        
        input.close();
    }
}
