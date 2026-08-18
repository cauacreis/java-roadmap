package cauafelype.maratona.java.javacore.annotations.teste;

import cauafelype.maratona.java.javacore.annotations.dominio.InformacaoDev;
import cauafelype.maratona.java.javacore.annotations.dominio.ProcessadorDePix;

public class Teste {
    public static void main(String[] args) {
        System.out.println("Investigando a classe ProcessadorDePix");

        Class<?> classe = ProcessadorDePix.class;

        if (classe.isAnnotationPresent(InformacaoDev.class)) {
            InformacaoDev informacao = classe.getAnnotation(InformacaoDev.class);

            System.out.println("Etiqueta encontrada!");
            System.out.println("Autor: " + informacao.autor());
            System.out.println("Versao: " + informacao.versao());
        } else {
            System.out.println("Nenhuma etiqueta encontrada no código!");
        }

    }
}
