package cauafelype.maratona.java.javacore.modificadorFinal.teste;

import cauafelype.maratona.java.javacore.modificadorFinal.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setNome("Hillux");
        System.out.println("Nome: " + carro.getNome());
        System.out.println("Velocidade limite: "+Carro.VELOCIDADE_LIMITE);
        carro.COMPRADOR.setNome("Kuririn");
        System.out.println(carro.COMPRADOR);

    }
}
