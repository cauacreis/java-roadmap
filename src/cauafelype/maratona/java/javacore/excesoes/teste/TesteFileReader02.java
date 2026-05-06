package cauafelype.maratona.java.javacore.excesoes.teste;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TesteFileReader02 {
    public static void main(String[] args) throws IOException {
        try (FileReader arquivo = new FileReader("C:/relatorio.txt")) {
            System.out.println("Lendo o relatorio.txt da pasta");
            System.out.println("Relatorio lido com sucesso!");
        }  catch (FileNotFoundException e) {
            System.out.println("Erro ao ler o relatorio.txt");
            System.out.println("Detalhe do erro: "+e.getMessage());
        } catch (IOException e) {
            System.out.println("Erro ao ler o relatorio.txt");
            System.out.println("Detalhe do erro: "+e.getMessage());
        }
        System.out.println("Sistema finalizado com sucesso!");
    }
}
