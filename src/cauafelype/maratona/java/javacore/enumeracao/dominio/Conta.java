package cauafelype.maratona.java.javacore.enumeracao.dominio;

public class Conta {
    private int numero;
    private double salario;
    protected TipoConta tipo;
    protected double saldo;


    public Conta(TipoConta tipo, int numero, double salario) {
        this.tipo = tipo;
        this.numero = numero;
        this.salario = salario;
        this.saldo = 0.0;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero=" + numero +
                ", tipo=" + tipo +
                ", salario=" + salario +
                ", saldo=" + saldo +
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
