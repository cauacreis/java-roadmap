package cauafelype.maratona.java.javacore.enumeracao.dominio;

public class ContaCorrente extends Conta{
    private double limiteChequeEspecial;


    public ContaCorrente(TipoConta tipo, int numero, double salario, double limiteChequeEspecial) {
        super(tipo, numero, salario);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public String toString() {
        return super.toString() + " | limiteChequeEspecial=" + limiteChequeEspecial;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }
}
