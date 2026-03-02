package cauafelype.maratona.java.javacore.modificadorestatico.teste;

import cauafelype.maratona.java.javacore.modificadorestatico.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro.setVelocidadeLimite(100);
        Carro carro = new Carro("Volkswagen", "T-Cross", 280);
        Carro carro02 = new Carro("Volkswagen", "Fusca", 110);
        carro.imprime();
        carro02.imprime();
        System.out.println("A velocidade limite: "+Carro.getVelocidadeLimite());
    }
}
