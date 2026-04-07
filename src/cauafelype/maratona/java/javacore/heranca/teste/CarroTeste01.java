package cauafelype.maratona.java.javacore.heranca.teste;

import cauafelype.maratona.java.javacore.heranca.dominio.Carro;
import cauafelype.maratona.java.javacore.heranca.dominio.Ferrari;
import cauafelype.maratona.java.javacore.heranca.dominio.Fusca;

public class CarroTeste01 {
    public static void main(String[] args) {
        System.out.println("------------");
        Ferrari ferrari = new Ferrari("TAYCAN", "123-ABC", 2006, "SUV", 29999999);
        Carro meuFusca = new Fusca("fuscao preto", "cabuloso-123", 1988, "TURBINADO", 18999);
        ferrari.imprime();
        ferrari.calcularImposto();
        System.out.println("------------");
        meuFusca.calcularImposto();
        meuFusca.imprime();
    }
}
