package cauafelype.maratona.java.javacore.excesoes.teste;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TesteFileReader {
    public static void main(String[] args) {

        // essa funcao de FileReader ela obriga você a colocar um try e um catch
        // isso pq ele é perigoso, pois ele pode parar de funcionar sem o controle do usuário
        // a energia pode cair enquanto lê o arquivo, o arquivo pode ser deletado e dentre outros problemas

        try {
            FileReader arquivo = new FileReader("C:/relatorio.txt");
            System.out.println("Relatório aberto com sucesso!");
        } catch (FileNotFoundException e) {
            System.out.println("Erro ao ler arquivo");
            System.out.println("Por favor verifique se o arquivo existe ou se o nome está correto!");
            System.out.println("Mensagem de erro: "+e.getMessage());
        }
    }
}
