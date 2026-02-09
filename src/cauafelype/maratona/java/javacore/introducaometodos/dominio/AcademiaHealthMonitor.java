package cauafelype.maratona.java.javacore.introducaometodos.dominio;

import cauafelype.maratona.java.javacore.introducaoclasse.dominio.AlunoAcademiaClasse;

import java.util.Objects;

public class AcademiaHealthMonitor {

    public static void calculadoraIMC(AlunoAcademiaClasse aluno) {
         aluno.imc = aluno.peso / (aluno.alturaEmMetros * aluno.alturaEmMetros);
        System.out.printf("O IMC do aluno %s é: %.2f%n", aluno.nome, aluno.imc);
    }
    public static void classificacaoDeIMC(AlunoAcademiaClasse aluno) {
        if (aluno.imc < 18.5) {
            System.out.printf("A classificação do aluno %s é: Magreza%n", aluno.nome);

        } else if (aluno.imc < 25) {
            System.out.printf("A classificação do aluno %s é: Peso Normal%n", aluno.nome);

        } else if (aluno.imc < 30) {
            System.out.printf("A classificação do aluno %s é: Sobrepeso%n", aluno.nome);

        } else if (aluno.imc < 35) {
            System.out.printf("A classificação do aluno %s é: Obesidade%n", aluno.nome);

        } else {
            System.out.printf("A classificação do aluno %s é: Obesidade Grave%n", aluno.nome);
        }
    }
    public static void taxaMetabolicaBasal (AlunoAcademiaClasse aluno) {
        int alturaEmCm;
        alturaEmCm = (int) (aluno.alturaEmMetros * 100);
        if (aluno.sexo.equalsIgnoreCase("M")) {
            aluno.taxaMetabolicaTMB = 66 + (13.7 * aluno.peso) + (5 * alturaEmCm) - (6.8 * aluno.idade);
            System.out.println("Essa é sua taxa metabólica basal: "+aluno.taxaMetabolicaTMB);
        } else {
            aluno.taxaMetabolicaTMB = 655 + (9.6 * aluno.peso) + (1.8 * alturaEmCm) - (4.7 * aluno.idade);
            System.out.println("Essa é sua taxa metabólica basal: "+aluno.taxaMetabolicaTMB);
        }
    }
    public static void fatorDeAtividade (AlunoAcademiaClasse aluno) {
        double fatorAtividade = switch (aluno.frequenciaAtividade) {
            case 1 -> 1.2;
            case 2 -> 1.375;
            case 3 -> 1.55;
            case 4 -> 1.725;
            default -> 1.2;
        };
        double gastoTotal = aluno.taxaMetabolicaTMB * fatorAtividade;
        System.out.printf("Você gasta em média essa quantidade de calorias por dia, baseado no seu nível de atividade: %.2f%n", gastoTotal);
    }
    public static void consumirAgua (AlunoAcademiaClasse aluno) {
        double agua = aluno.peso * 50;
        System.out.println("Você deve consumir essa quantidade de água por dia: "+agua);
    }
}

