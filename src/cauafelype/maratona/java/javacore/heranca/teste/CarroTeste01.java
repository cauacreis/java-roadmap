package cauafelype.maratona.java.javacore.heranca.teste;

import cauafelype.maratona.java.javacore.heranca.dominio.Carro;
import cauafelype.maratona.java.javacore.heranca.dominio.Ferrari;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro = new Carro("TAYCAN", "123-ABC", 2006, "SUV");
        System.out.println("------------");
        carro.imprime();
        System.out.println("------------");
        Ferrari ferrari = new Ferrari("TAYCAN", "123-ABC", 2006, "SUV", 29999999);
        ferrari.imprime();
    }
}
