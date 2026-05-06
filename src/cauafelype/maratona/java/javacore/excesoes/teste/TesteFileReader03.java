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
                // tomar cuidado com isso
                // se a mensagem vier de um banco de dados da oracle por exemplo, se eu jogar minha mensagem por cima,
                // a mensagem original da oracle desaparece eternamente e eu perco meu tempo tentando achar o pq o banco n funciona
                // como por exemplo, o banco poderia retornar que a tabela x não existe
                // mas com a mensagem específica nossa, só falaria que não conseguiu acessar
            }
        } catch (SQLException | IOException e) {
            System.out.println("Erro crítico (banco de dados ou arquivo)! \ndetalhe: "+e.getMessage());
        }
        System.out.println("Sistema finalizado com sucesso!");
    }
}
