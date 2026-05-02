package cauafelype.maratona.java;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
        List<String> nome = new ArrayList<>();
        nome.add("Cauã");
        nome.add("Pedro");

        System.out.println(nome);
        System.out.println("Este é o tamanho da lista nomes: "+nome.size());
        nome.remove("Cauã");
        System.out.println("Lista atualizada: "+nome);
    }
}
