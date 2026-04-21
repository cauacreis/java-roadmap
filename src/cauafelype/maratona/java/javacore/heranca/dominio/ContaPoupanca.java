package cauafelype.maratona.java.javacore.heranca.dominio;
import java.util.Scanner;

public final class ContaPoupanca extends Conta {

    public ContaPoupanca(int numero) {
        super(numero);
    }

    @Override
    public void sacar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor a ser sacado: ");
        double valor = sc.nextDouble();
        if (saldo >= valor) {
            System.out.println("Saque da poupança realizado com sucesso!");
        } else  {
            System.out.println("Saldo da poupança insuficiente!");
        }
    }
}
