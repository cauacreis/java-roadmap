package cauafelype.maratona.java.javacore.excesoes.teste;

import cauafelype.maratona.java.javacore.enumeracao.dominio.TipoConta;
import cauafelype.maratona.java.javacore.excesoes.dominio.Conta;
import cauafelype.maratona.java.javacore.excesoes.dominio.SaldoInsuficienteException;

public class ContaTeste02 {
    public static void main(String[] args) {
        Conta contaFelype = new Conta("Felype", 100, TipoConta.CORRENTE);
        try {
            contaFelype.sacar(50);
            contaFelype.sacar(100);
            System.out.println("Saque de 100 realizado com sucesso!");
        } catch (SaldoInsuficienteException e) {
            System.out.println("Sistema do banco detectou um erro: ");
            System.out.println(e.getMessage());
        }
    }
}
