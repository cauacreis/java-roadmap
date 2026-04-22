package cauafelype.maratona.java.javacore.enumeracao.dominio;

public class Conta {
    private int numero;
    private double salario;
    protected TipoConta tipo;


    public Conta(TipoConta tipo, double salario, int numero) {
        this.tipo = tipo;
        this.salario = salario;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero=" + numero +
                ", salario=" + salario +
                ", tipo=" + tipo +
                '}';
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
