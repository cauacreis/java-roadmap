package cauafelype.maratona.java.introducao;

import java.util.Scanner;

public class EstruturasCondicionaisTernario {
    public static void main(String[] args) {
        // História: Quero doar 500 reais para um instituição de caridade, mas só posso doar se meu salário por de 5000
        // Vou primeiro mostrar como resolver da forma antiga
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual é seu salário: ");
        double salario = leitor.nextDouble();

        if (salario >= 5000) {
            System.out.println("Você pode doar para a instituição de caridade");
        } else {
            System.out.println("Você não pode doar para a instituição de caridade :/");
        }

        // Agora da nova maneira, operador ternário
        // (condicao) ? verdadeiro : falso
        // Se eu receber um salário de 5000, vou investir 500 na bolsa de valores

        String mensagemInvestir = "Eu vou investir 500 na bolsa de valores";
        String mensagemNaoInvestir = "Eu não vou investir 500 na bolsa de valores";

        String resultado = salario >= 5000 ? mensagemInvestir : mensagemNaoInvestir;
        System.out.println(resultado);
        leitor.close();
    }
}
