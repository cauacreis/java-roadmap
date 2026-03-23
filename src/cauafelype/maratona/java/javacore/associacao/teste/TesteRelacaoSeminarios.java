package cauafelype.maratona.java.javacore.associacao.teste;

import cauafelype.maratona.java.javacore.associacao.dominio.AlunoS;
import cauafelype.maratona.java.javacore.associacao.dominio.LocalS;
import cauafelype.maratona.java.javacore.associacao.dominio.SeminarioS;
// Se for usar o professor, não esqueça de importar a classe dele também!
import cauafelype.maratona.java.javacore.associacao.dominio.ProfessorS;

public class TesteRelacaoSeminarios {
    public static void main(String[] args) {
        // 1. Criando os objetos soltos
        LocalS local = new LocalS("H202");
        AlunoS maria = new AlunoS("Maria", 23);
        AlunoS joao2 = new AlunoS("Joao", 53);
        AlunoS davi3 = new AlunoS("Davi", 23); // Padronizei para minúscula por convenção
        ProfessorS professor = new ProfessorS("Mestre Yoda", "Geografia Física");

        // 2. Criando o seminário já com o Local (passando a variável 'local' sem aspas)
        SeminarioS geo = new SeminarioS("Geografia", local);

        // 3. Associando os alunos ao seminário (0:N - O Seminário recebe um Array)
        AlunoS[] alunosParaSeminario = {maria, joao2, davi3}; // Cria o array com os objetos
        geo.setAlunos(alunosParaSeminario); // Adiciona o array no seminário

        // 4. Associando o seminário aos alunos (1:1 - O Aluno recebe o objeto Seminário)
        maria.setSeminario(geo);
        joao2.setSeminario(geo);
        davi3.setSeminario(geo);

        // 5. Associando o seminário ao professor
        SeminarioS[] seminariosDoProfessor = {geo};
        professor.setSeminario(seminariosDoProfessor);

        // 6. Testando as impressões
        System.out.println("========== DADOS DO SEMINÁRIO ==========");
        geo.imprime();

        System.out.println("\n========== DADOS DO PROFESSOR ==========");
        professor.imprime();

        System.out.println("\n========== DADOS DE UM ALUNO ==========");
        maria.imprime();
    }
}