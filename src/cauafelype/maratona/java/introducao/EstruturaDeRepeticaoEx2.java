package cauafelype.maratona.java.introducao;

import java.util.Scanner;

public class EstruturaDeRepeticaoEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Variáveis descritivas (Evitando "Números Mágicos")
        double valorTotalCarro = 100000.0;
        double valorMinimoParcela = 1000.0;

        System.out.println("--- SIMULADOR DE FINANCIAMENTO ---");
        System.out.println("Valor do Veículo: R$ " + valorTotalCarro);
        System.out.print("Digite o máximo de parcelas desejado: ");
        int maxParcelas = scanner.nextInt();

        System.out.println("\n--- Tabela de Parcelas Válidas ---");

        // 2. Mudamos 'i' para 'parcela' (Contexto é tudo!)
        for (int parcela = 1; parcela <= maxParcelas; parcela++) {

            double valorParcelaCalculada = valorTotalCarro / parcela;

            // 3. Verificação de Regra de Negócio
            if (valorParcelaCalculada < valorMinimoParcela) {
                System.out.println("-----------------------------------------------------");
                System.out.println("PARADA AUTOMÁTICA: Parcelas seguintes seriam menores que R$ 1.000,00");
                break;
            }

            // 4. O segredo da beleza: printf
            // %d = Inteiro (parcela)
            // %.2f = Decimal com 2 casas (valor)
            // %n = Pula linha
            System.out.printf("Opção %d: %d x de R$ %.2f %n", parcela, parcela, valorParcelaCalculada);
        }

        scanner.close();
    }
}