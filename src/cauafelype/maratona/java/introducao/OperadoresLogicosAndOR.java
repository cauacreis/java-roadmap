package cauafelype.maratona.java.introducao;

public class OperadoresLogicosAndOR {
    public static void main(String[] args) {
        // && (AND) e || (OR) e !

        int idade = 35;
        int idade2 = 20;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario > 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade2 < 30 && salario >= 3381;
        boolean isDentroDaLei = idade < 30 || salario > 3499;
        System.out.println("O trabalhador esta conforme a lei? "+ isDentroDaLeiMaiorQueTrinta);
        System.out.println("O trabalhador2 esta conforme a lei? "+ isDentroDaLeiMenorQueTrinta);
        System.out.println("O trabalhador3 esta conforme a lei? "+ isDentroDaLei);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        boolean isPs5Compravel = valorTotalContaCorrente >= 3000 || valorTotalContaPoupanca >= 3000;
        System.out.println("Eu consigo comprar meu ps5? "+ isPs5Compravel);
    }
}
