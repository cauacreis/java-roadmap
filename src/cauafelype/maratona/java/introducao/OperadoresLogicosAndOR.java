package cauafelype.maratona.java.introducao;

public class OperadoresLogicosAndOR {
    public static void main(String[] args) {
        // && (AND) e || (OR) e !

        int idade = 35;
        int idade2 = 20;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario > 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade2 < 30 && salario >= 3381;
        System.out.println("O trabalhador esta conforme a lei? "+ isDentroDaLeiMaiorQueTrinta);
        System.out.println("O trabalhador2 esta conforme a lei? "+ isDentroDaLeiMenorQueTrinta);

    }
}
