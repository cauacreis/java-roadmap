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
