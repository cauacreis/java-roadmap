package cauafelype.maratona.java.javacore.heranca.dominio;

public final class ContaPoupanca extends Conta {

    public ContaPoupanca(int numero) {
        super(numero);
    }

    @Override
    public void sacar(double valor) {
        if (saldo >= valor) {
            System.out.println("Saque da poupança realizado com sucesso!");
            saldo -= valor;
        } else  {
            System.out.println("Saldo da poupança insuficiente!");
        }
    }
}
