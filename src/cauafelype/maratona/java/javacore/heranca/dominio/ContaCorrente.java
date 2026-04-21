package cauafelype.maratona.java.javacore.heranca.dominio;

public class ContaCorrente extends Conta{
    protected double limiteChequeEspecial;

    public ContaCorrente(int numero, double limiteChequeEspecial) {
        super(numero);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public void sacar() {
        if (limiteChequeEspecial <= saldo) {
            System.out.println("Saque realizado");
        } else {
            System.out.println("Saldo insuficiente, mesmo com o cheque especial");
        }
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }
}
