package cauafelype.maratona.java.javacore.introducaometodos.teste;

import cauafelype.maratona.java.javacore.introducaoclasse.dominio.AlunoAcademiaClasse;
import cauafelype.maratona.java.javacore.introducaometodos.dominio.AcademiaHealthMonitor;

import java.util.Scanner;

public class HealthMonitorTeste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String continuar = "S";
        AlunoAcademiaClasse aluno = new AlunoAcademiaClasse();


        while (continuar.equalsIgnoreCase("S")) {
            System.out.println("Digite o seu nome: ");
            aluno.setNome(input.nextLine());
            System.out.println("Digite o seu peso: (Kg)");
            aluno.setPeso(input.nextDouble());
            System.out.println("Digite a sua altura: (Metros)");
            aluno.setAlturaEmMetros(input.nextDouble());
            input.nextLine();
            while (true) {
                System.out.println("Digite seu sexo: (M ou F)");
                aluno.setSexo(input.nextLine());
                if (aluno.getSexo().equalsIgnoreCase("M") || aluno.getSexo().equalsIgnoreCase("F")) {
                    break;
                } else {
                    System.out.println("Digite uma letra válida, M ou F");
                }
            }
            while (true) {
                System.out.println("Digite a sua idade: ");
                aluno.setIdade(input.nextInt());
                if (aluno.getIdade() > 0) {
                    break;
                } else {
                    System.out.println("Digite uma idade válida, que seja maior que 0!");
                }
            }
            while (true) {
                System.out.println("Digite sua frequência de atividades: (1 a 4)");
                aluno.setFrequenciaAtividade(input.nextInt());
                if (aluno.getFrequenciaAtividade() < 5 && aluno.getFrequenciaAtividade() > 0) {
                    break;
                } else {
                    System.out.println("Digite uma frequência válida, de 1 a 4!");
                }
            }
            while (true) {
                System.out.println("Agora me fale seu objetivo: (1 para emagrecer, 2 para ganhar massa, 3 para manter)");
                aluno.setObjetivo(input.nextInt());
                if (aluno.getObjetivo() < 4 && aluno.getObjetivo() > 0) {
                    break;
                } else {
                    System.out.println("Digite um objetivo válido, de 1 a 3");
                }
            }
            AcademiaHealthMonitor.processandoDados();
            AcademiaHealthMonitor.calculadoraIMC(aluno);
            AcademiaHealthMonitor.divisaoDeTexto();
            AcademiaHealthMonitor.classificacaoDeIMC(aluno);
            AcademiaHealthMonitor.divisaoDeTexto();
            AcademiaHealthMonitor.taxaMetabolicaBasal(aluno);
            AcademiaHealthMonitor.divisaoDeTexto();
            AcademiaHealthMonitor.fatorDeAtividade(aluno);
            AcademiaHealthMonitor.divisaoDeTexto();
            AcademiaHealthMonitor.consumirAgua(aluno);
            AcademiaHealthMonitor.divisaoDeTexto();
            AcademiaHealthMonitor.objetivo(aluno);
            AcademiaHealthMonitor.divisaoDeTexto();
            AcademiaHealthMonitor.treinoAluno(aluno);
            AcademiaHealthMonitor.divisaoDeTexto();
            AcademiaHealthMonitor.calcularMacros(aluno);

            System.out.println("\n-------------------------------------");
            System.out.println("Deseja utilizar o HealthMonitor denovo? (S para sim & N para não)");
            input.nextLine();
            continuar = input.nextLine();
        }
        input.close();
        System.out.println("Sistema encerrado! Obrigado por utilizar!");
    }
}
