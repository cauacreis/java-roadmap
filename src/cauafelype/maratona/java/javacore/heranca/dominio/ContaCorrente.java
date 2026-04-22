package cauafelype.maratona.java.javacore.heranca.dominio;

public class ContaCorrente extends Conta{
    protected double limiteChequeEspecial;

    public ContaCorrente(int numero, double limiteChequeEspecial) {
        super(numero);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public void sacar(double valor) {
        if (saldo + limiteChequeEspecial >= valor) {
            System.out.println("Saque realizado");
            saldo -= valor;
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
