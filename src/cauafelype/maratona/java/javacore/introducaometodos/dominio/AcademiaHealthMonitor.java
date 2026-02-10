package cauafelype.maratona.java.javacore.introducaometodos.dominio;

import cauafelype.maratona.java.javacore.introducaoclasse.dominio.AlunoAcademiaClasse;

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
            System.out.println("Essa é sua taxa metabólica basal: "+aluno.taxaMetabolicaTMB+"KCAL");
        }
    }
    public static void fatorDeAtividade (AlunoAcademiaClasse aluno) {
        double fatorAtividade = switch (aluno.frequenciaAtividade) {
            case 2 -> 1.375;
            case 3 -> 1.55;
            case 4 -> 1.725;
            default -> 1.2;
        };
        aluno.gastoTotal = aluno.taxaMetabolicaTMB * fatorAtividade;
        System.out.printf("Você gasta em média essa quantidade de calorias por dia, baseado no seu nível de atividade: %.2f KCAL%n", aluno.gastoTotal);
    }
    public static void consumirAgua (AlunoAcademiaClasse aluno) {
        double agua = aluno.peso * 50;
        System.out.println("Você deve consumir essa quantidade de água por dia: "+agua+"ML");
    }
    public static void objetivo (AlunoAcademiaClasse aluno) {
        double caloriasObjetivo;
        switch (aluno.objetivo) {
            case 1 -> {
                System.out.println("Você deve começar um déficit calórico de 50 calorias por semana, diminua até chegar 500 calorias a menos: ");
                caloriasObjetivo = aluno.gastoTotal - 500;
                System.out.printf("O máximo de déficit a ser alcançado é: %.2f KCAL%n", caloriasObjetivo);
            }
            case 2 -> {
                System.out.println("Você deve começar um processo de bulking, aumente 50 calorias por semana, até chegar 500 calorias a mais");
                caloriasObjetivo = aluno.gastoTotal + 500;
                System.out.printf("O máximo de bulking a ser alcançado é: %.2f KCAL%n", caloriasObjetivo);
            }
            case 3 ->
                System.out.println("Apenas consuma a quantidade necessária de calorias que você necessita: "+aluno.gastoTotal);
        }
    }
    public static void treinoAluno (AlunoAcademiaClasse aluno) {
        switch (aluno.objetivo) {
            case 1 -> {
                System.out.println("OBJETIVO: EMAGRECIMENTO (PERDA DE GORDURA)");
                System.out.println("Estilo: Circuito Metabólico (Descanso curto: 30s)");
                System.out.println("----------------------------------------");
                System.out.println("AQUECIMENTO: 10 min de Caminhada/Trote");
                System.out.println("----------------------------------------");
                System.out.println("1. Agachamento Livre (3x 15 reps)");
                System.out.println("2. Flexão de Braços (3x 10-12 reps)");
                System.out.println("3. Polichinelos (3x 1 min)");
                System.out.println("4. Remada Curvada (3x 15 reps)");
                System.out.println("5. Mountain Climbers (3x 40 seg)");
                System.out.println("6. Prancha Abdominal (3x até a falha)");
                System.out.println("----------------------------------------");
                System.out.println("CARDIO FINAL: 20 min moderado (Bike ou Esteira)");
            }
            case 2 -> {
                System.out.println("OBJETIVO: HIPERTROFIA (GANHO DE MASSA)");
                System.out.println("Estilo: Divisão ABC (Descanso: 90s a 120s)");
                System.out.println("----------------------------------------");
                System.out.println("TREINO A (Peito, Ombros e Tríceps):");
                System.out.println("- Supino Reto (4x 8-10)");
                System.out.println("- Desenvolvimento Militar (4x 8-10)");
                System.out.println("- Tríceps Testa (3x 10-12)");
                System.out.println("");
                System.out.println("TREINO B (Costas e Bíceps):");
                System.out.println("- Puxada Alta ou Barra Fixa (4x 8-10)");
                System.out.println("- Remada Baixa (4x 10)");
                System.out.println("- Rosca Direta (3x 10-12)");
                System.out.println("");
                System.out.println("TREINO C (Pernas Completo):");
                System.out.println("- Agachamento Livre (4x 8)");
                System.out.println("- Leg Press 45 (4x 10)");
                System.out.println("- Cadeira Extensora (3x 12)");
            }
            case 3 -> {
                System.out.println("OBJETIVO: MANUTENÇÃO E SAÚDE (FUNCIONAL)");
                System.out.println("Estilo: Full Body (Corpo Todo)");
                System.out.println("----------------------------------------");
                System.out.println("1. Pular Corda (3x 2 min)");
                System.out.println("2. Kettlebell Swing (3x 15)");
                System.out.println("3. Afundo/Passada (3x 12 cada perna)");
                System.out.println("4. Barra Fixa ou Puxada (3x 10)");
                System.out.println("5. Desenvolvimento com Halteres (3x 12)");
                System.out.println("6. Abdominal Remador (3x 20)");
                System.out.println("----------------------------------------");
                System.out.println("DICA: Foque na execução perfeita e alongamento.");
            }
            default -> System.out.println("Objetivo não identificado. Consulte um instrutor.");

        }
    }
    public static void divisaoDeTexto () {
        System.out.println("--------------------------");
    }
}

