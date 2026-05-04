package cauafelype.maratona.java.javacore.excesoes.teste;

import cauafelype.maratona.java.javacore.enumeracao.dominio.TipoConta;
import cauafelype.maratona.java.javacore.excesoes.dominio.Conta;

public class ContaTeste01 {
    public static void main(String[] args) {
        Conta contaCorrente = new Conta("Cauã", 2000, TipoConta.CORRENTE);
        contaCorrente.depositar(500);
        contaCorrente.sacar(3500);
    }
}
