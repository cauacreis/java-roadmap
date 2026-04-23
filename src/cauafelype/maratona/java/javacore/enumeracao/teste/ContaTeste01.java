package cauafelype.maratona.java.javacore.enumeracao.teste;

import cauafelype.maratona.java.javacore.enumeracao.dominio.Conta;
import cauafelype.maratona.java.javacore.enumeracao.dominio.TipoConta;

public class ContaTeste01 {
    public static void main(String[] args) {
        Conta cc = new Conta(TipoConta.SALARIO, 9991, 5000.0, 1000, 1000);
        System.out.println(cc);
        cc.depositar(5000);
        System.out.println(cc);
        cc.sacar(5000);
        System.out.println(cc);
    }
}
