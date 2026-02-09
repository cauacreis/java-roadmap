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
        System.out.println("Digite o seu altura: ");
            aluno.alturaEmMetros = input.nextDouble();
            input.nextLine();
        System.out.println("Digite seu sexo: (M ou F)");
            aluno.sexo = input.nextLine();
        System.out.println("Digite a sua idade: ");
            aluno.idade = input.nextInt();
        System.out.println("Digite sua frequência de atividades: (1 a 4)");
            aluno.frequenciaAtividade = input.nextInt();
        System.out.println("Agora me fale seu objetivo: (1 para emagrecer, 2 para ganhar massa, 3 para manter)");
            aluno.objetivo = input.nextInt();

        AcademiaHealthMonitor.calculadoraIMC(aluno);
        AcademiaHealthMonitor.classificacaoDeIMC(aluno);
        AcademiaHealthMonitor.taxaMetabolicaBasal(aluno);
        AcademiaHealthMonitor.fatorDeAtividade(aluno);
        AcademiaHealthMonitor.consumirAgua(aluno);
        AcademiaHealthMonitor.objetivo(aluno);
    }
}
