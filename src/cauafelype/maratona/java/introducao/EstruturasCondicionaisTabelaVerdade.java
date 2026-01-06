package cauafelype.maratona.java.introducao;

import java.util.Scanner;

public class EstruturasCondicionaisTabelaVerdade {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

            System.out.println("--- SEGURANÇA DE BANCO 2000 ---");
            System.out.println("- Responda com true(sim ou  false(não) -");
            System.out.println("É horário comercial? ");
        boolean isHorarioComercial = leitor.nextBoolean();
            System.out.println("-------------------------------");
            System.out.println("O banco está vazio? ");
        boolean isVazio = leitor.nextBoolean();
            System.out.println("-------------------------------");
            System.out.println("A senha está correta? ");
        boolean isSenhaCorreta = leitor.nextBoolean();
            System.out.println("-------------------------------");
            System.out.println("A digital está correta? ");
        boolean isDigitalCorreta = leitor.nextBoolean();

            System.out.println("Você quer abrir o banco? ");
        boolean isAbrirPorta = leitor.nextBoolean();

        if(isAbrirPorta) {
            System.out.println("Vamos verificar se você pode abrir a porta: ");
            if (isVazio && isSenhaCorreta && isDigitalCorreta && isHorarioComercial) {
                System.out.println("Você pode acessar o cofre então!");
            } else {
                System.out.println("Você não tem direito de entrar aqui! A polícia está sendo convocada!!");
            }
        } else {
            System.out.println("Vá embora então, saia de perto da porta do cofre.");
        }
        leitor.close();
    }
}
