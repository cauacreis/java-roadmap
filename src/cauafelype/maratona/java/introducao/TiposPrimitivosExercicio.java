package cauafelype.maratona.java.introducao;

public class TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Abreu Da Silva Pereira";
        String endereco = "Rua dos Grandes 12";
        double salario = 2500.00;
        String dataRecebimento = "30/12/2025";
        String relatorioSalario = "I "+nome+", residing at "+endereco+", confirm that i received the salary of "+salario+", on "+dataRecebimento;

        System.out.println(relatorioSalario);
        System.out.println("Eu: " + nome + ", morando no endereço: "+ endereco + ", confirmo que recebi o salário de: "
                + salario + ", na data: " + dataRecebimento);
    }
}
