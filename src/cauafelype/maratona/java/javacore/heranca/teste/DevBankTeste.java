package cauafelype.maratona.java.javacore.heranca.teste;

import cauafelype.maratona.java.javacore.heranca.dominio.Conta;
import cauafelype.maratona.java.javacore.heranca.dominio.ContaCorrente;
import cauafelype.maratona.java.javacore.heranca.dominio.ContaPoupanca;

public class DevBankTeste {
    public static void main(String[] args) {
        Conta contaCorrente = new ContaCorrente(12345, 1000);
        Conta contaPoupanca = new ContaPoupanca(12345);
        contaCorrente.depositar(500);
        contaPoupanca.depositar(500);

        Conta[] contasDoUsuario = new Conta[]{contaCorrente, contaPoupanca};
        for (Conta conta : contasDoUsuario) {
            conta.imprimirSaldo();
            conta.sacar(800);
            conta.imprimirSaldo();
        }
    }
}
