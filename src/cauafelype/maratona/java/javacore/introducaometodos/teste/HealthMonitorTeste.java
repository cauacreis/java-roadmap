package cauafelype.maratona.java.javacore.introducaometodos.teste;

import cauafelype.maratona.java.javacore.introducaoclasse.dominio.AlunoAcademiaClasse;
import cauafelype.maratona.java.javacore.introducaometodos.dominio.AcademiaHealthMonitor;

import java.util.Scanner;

public class HealthMonitorTeste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        AlunoAcademiaClasse aluno = new AlunoAcademiaClasse();

        System.out.println("Digite o seu nome: ");
        aluno.nome = input.nextLine();
        System.out.println("Digite o seu peso: ");
        aluno.peso = input.nextDouble();
        System.out.println("Digite a sua altura: ");
        aluno.alturaEmMetros = input.nextDouble();
        input.nextLine();
        while (true) {
            System.out.println("Digite seu sexo: (M ou F)");
            aluno.sexo = input.nextLine();
            if (aluno.sexo.equalsIgnoreCase("M") || aluno.sexo.equalsIgnoreCase("F")) {
                break;
            } else {
                System.out.println("Digite uma letra válida, M ou F");
            }
        }
        while (true) {
            System.out.println("Digite a sua idade: ");
            aluno.idade = input.nextInt();
            if (aluno.idade > 0) {
                break;
            } else {
                System.out.println("Digite uma idade válida, que seja maior que 0!");
            }
        }
        while (true) {
            System.out.println("Digite sua frequência de atividades: (1 a 4)");
            aluno.frequenciaAtividade = input.nextInt();
            if (aluno.frequenciaAtividade < 5 && aluno.frequenciaAtividade > 0) {
                break;
            } else {
                System.out.println("Digite uma frequência válida, de 1 a 4!");
            }
        }
        while (true) {
            System.out.println("Agora me fale seu objetivo: (1 para emagrecer, 2 para ganhar massa, 3 para manter)");
            aluno.objetivo = input.nextInt();
            if (aluno.objetivo < 4 && aluno.objetivo > 0) {
                break;
            } else {
                System.out.println("Digite um objetivo válido, de 1 a 3");
            }
        }
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
    }
}
