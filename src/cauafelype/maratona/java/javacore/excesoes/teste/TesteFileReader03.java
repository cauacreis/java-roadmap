package cauafelype.maratona.java.javacore.excesoes.teste;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;

public class TesteFileReader03 {
    public static void main(String[] args) {
        try (FileReader arquivo = new FileReader("C:/relatorio.txt")) {
            System.out.println("Lendo o relatorio.txt da pasta");
            System.out.println("Relatorio lido com sucesso!");
            boolean bancoCaiu = true;
            if (bancoCaiu) {
                throw new SQLException("Erro ao acessar o banco de dados!");
            }
        } catch (SQLException | IOException e) {
            System.out.println("Erro crítico (banco de dados ou arquivo)! \ndetalhe: "+e.getMessage());
        }
        System.out.println("Sistema finalizado com sucesso!");
    }
}
