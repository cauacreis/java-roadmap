package cauafelype.maratona.java.javacore.excesoes.dominio;

import cauafelype.maratona.java.javacore.enumeracao.dominio.TipoConta;

public class Conta {
    private String titular;
    private double saldo;
    private TipoConta tipo;

    public Conta(String titular, double saldo, TipoConta tipo) {
        this.titular = titular;
        this.saldo = saldo;
        this.tipo = tipo;
    }

    public void depositar (double valor) {
        System.out.println("Depositando "+valor);
        this.saldo += valor;
        System.out.println("Saldo atual: "+saldo);
    }

    

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public TipoConta getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "titular='" + titular + '\'' +
                ", saldo=" + saldo +
                ", tipo=" + tipo +
                '}';
    }
}
