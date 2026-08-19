package cauafelype.maratona.java.javacore.annotations.desafio.teste;

import cauafelype.maratona.java.javacore.annotations.desafio.dominio.Cliente;
import cauafelype.maratona.java.javacore.annotations.desafio.dominio.ValidadorDeObjetos;

public class BaladaTeste {
    public static void main(String[] args) {
        System.out.println("Segurança, documentos por favor!");

        Cliente caua = new Cliente("Cauã", 16);

        try {
            ValidadorDeObjetos.validar(caua);
            System.out.println("Liberado pode entrar");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
