package cauafelype.maratona.java.javacore.heranca.dominio;
import java.util.Scanner;

public abstract class Conta {
    protected double saldo = 0;
    protected int numero;

    public Conta(int numero) {
        this.numero = numero;
    }

    public final void depositar(double valor){
        saldo += valor;
    }
    public abstract void sacar(double valor);

    public double getSaldo() {
        return saldo;
    }

    public void imprimirSaldo() {
        System.out.println("Este é seu saldo: "+saldo);
        System.out.println("Este é o número da sua conta: "+numero);
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
