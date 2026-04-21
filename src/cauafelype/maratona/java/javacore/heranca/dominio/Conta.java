package cauafelype.maratona.java.javacore.heranca.dominio;
import java.util.Scanner;

public class Conta {
    protected double saldo;
    protected int numero;

    public Conta(int numero) {
        this.numero = numero;
        saldo = 0;
    }

    public final void depositar(double valor){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor depositado: ");
        saldo += valor;
    }
    public final void sacar(double valor){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor sacado: ");
        saldo -= valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
