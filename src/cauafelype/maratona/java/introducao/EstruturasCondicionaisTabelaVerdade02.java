package cauafelype.maratona.java.introducao;

import java.util.Scanner;

public class EstruturasCondicionaisTabelaVerdade02 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("--- Segurança de BANCO 2.0 ---");
        System.out.println("------------------------------");
        System.out.println(" Vou fazer algumas perguntas! ");
        System.out.println(" Você é o CEO do banco? true or false ");
        boolean isDiretor = leitor.nextBoolean();
        System.out.println("------------------------------");
        System.out.println("É horário comercial? true or false");
        boolean isHorarioComercial = leitor.nextBoolean();
        System.out.println("------------------------------");
        System.out.println("A senha está correta? true or false");
        boolean isSenha = leitor.nextBoolean();
        System.out.println("------------------------------");
        System.out.println("A digital está correta? true or false");
        boolean isDigitalCorreta = leitor.nextBoolean();
        System.out.println("------------------------------");
            if (isDiretor) {
                System.out.println("Você está liberado para entrar, independente das condições!");
            } else {
                System.out.println("Vou conferir as informações, já que você não é o diretor! ");
                if (isDigitalCorreta && isSenha && isHorarioComercial) {
                    System.out.println("Entre senhor fodão!");
                } else if (isDigitalCorreta && isSenha  && !isHorarioComercial) {
                    System.out.println("Você não pode entrar fora do horário comercial");
                } else {
                    System.out.println("ACESSO NEGADO: Credenciais inválidas! Chamando a polícia!");
                }
            }
    }
}
