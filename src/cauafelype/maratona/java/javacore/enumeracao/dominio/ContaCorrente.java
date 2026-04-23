package cauafelype.maratona.java.javacore.enumeracao.dominio;

public class ContaCorrente extends Conta{

    public ContaCorrente(TipoConta tipo, int numero, double salario, double limiteChequeEspecial, double saldo) {
        super(tipo, numero, salario, saldo);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }
}
