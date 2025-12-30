package cauafelype.maratona.java.introducao;

import java.util.Scanner;

public class TiposPrimitivosExercicio2 {
    public static void main(String[] args) {
        Scanner dadosDoUsuario = new Scanner(System.in);
            System.out.println("Digite o nome do usuario: ");
        String nomeUsuario = dadosDoUsuario.nextLine();
            System.out.println("Digite o salario do usuario: ");
        double salarioUsuario = dadosDoUsuario.nextDouble();
        dadosDoUsuario.nextLine();
            System.out.println("Digite o endereco do usuario: ");
        String enderecoUsuario = dadosDoUsuario.nextLine();
            System.out.println("Digite a data do recebimento do salario do usuario: ");
        String salarioRecebimento = dadosDoUsuario.nextLine();

        dadosDoUsuario.close();
            System.out.println("Meu nome é "+nomeUsuario + ", eu recebo " + salarioUsuario + ", e eu moro na " + enderecoUsuario + ", e recebo nessa data " + salarioRecebimento);
    }

}
