package cauafelype.maratona.java.javacore.enumeracao.dominio;

public class Conta {
    private int numero;
    private double salario;
    protected TipoConta tipo;
    protected double saldo;
    protected double limiteChequeEspecial;


    public Conta(TipoConta tipo, int numero, double salario, double saldo) {
        this.tipo = tipo;
        this.numero = numero;
        this.salario = salario;
        this.saldo = saldo;
    }
    public Conta(TipoConta tipo, int numero, double salario, double limiteChequeEspecial, double saldo) {
        this.tipo = tipo;
        this.numero = numero;
        this.salario = salario;
        this.limiteChequeEspecial = limiteChequeEspecial;
        this.saldo = saldo;
    }

    public final void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (this.tipo == TipoConta.CORRENTE) {
            // Regra da Conta Corrente
            if (saldo + limiteChequeEspecial >= valor) {
                System.out.println("Saque da Corrente realizado!");
                saldo -= valor;
            } else {
                System.out.println("Saldo insuficiente, mesmo com limite.");
            }

        } else if (this.tipo == TipoConta.POUPANCA) {
            // Regra da Poupança
            if (saldo >= valor) {
                System.out.println("Saque da Poupança realizado!");
                saldo -= valor;
            } else {
                System.out.println("Saldo da poupança insuficiente!");
            }
        }
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero=" + numero +
                ", salario=" + salario +
                ", tipo=" + tipo +
                ", saldo=" + saldo +
                ", limiteChequeEspecial=" + limiteChequeEspecial +
                '}';
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public TipoConta getTipo() {
        return tipo;
    }

    public void setTipo(TipoConta tipo) {
        this.tipo = tipo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
