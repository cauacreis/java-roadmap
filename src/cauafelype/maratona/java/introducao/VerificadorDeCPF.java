package cauafelype.maratona.java.introducao;

import java.util.Scanner;

public class VerificadorDeCPF {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int peso = 10;
        int[] cpf = new int[11];
        int soma = 0;
        int restoDaSoma = 0;
        int divisao = 0;
        for(int i=0;i< cpf.length;i++) {
            System.out.println("Digite seu cpf a seguir: ");
            cpf[i] = input.nextInt();
        }
        for (int i = 0; i < 9; i++) {
            soma = soma + (cpf[i] * peso);
             peso--;
        }
        divisao = soma / 11;
        restoDaSoma = soma % 11;

// Variável para guardar o dígito que vamos descobrir
        int primeiroDigitoVerificador;

// A REGRA DO ZERO
        if (restoDaSoma < 2) {
            primeiroDigitoVerificador = 0;
        } else {
            // A REGRA DA SUBTRAÇÃO
            primeiroDigitoVerificador = 11 - restoDaSoma;
        }

        System.out.println("O cálculo diz que o primeiro dígito deve ser: " + primeiroDigitoVerificador);
        System.out.println("O usuário digitou: " + cpf[9]);

// VERIFICAÇÃO
        if (primeiroDigitoVerificador == cpf[9]) {
            System.out.println("O primeiro dígito é VÁLIDO!");
        } else {
            System.out.println("CPF INVÁLIDO (Primeiro dígito errado).");
            return;
        }
    }
}
