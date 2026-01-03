package cauafelype.maratona.java.introducao;

public class OperadoresDeAtribuicao {
    public static void main(String[] args) {
        // =  +- -= *= /= %=

        double bonus = 1800;
        double bonus2 = 1800;
        double bonus3 = 1800;
        double bonus4 = 1800;
        double bonus5 = 1800;
        bonus += 1000;
        bonus2 -= 1000;
        bonus3 *= 1000;
        bonus4 /= 1000;
        bonus5 %= bonus4;
        System.out.println("Foi removido 1000 reais no seu bonus: " + bonus);
        System.out.println("Foi removido 1000 reais no seu bonus: " + bonus2);
        System.out.println("Seu bonus foi multiplicado em 1000 vezes: " + bonus3);
        System.out.println("Seu bonus foi dividido em 1000 vezes: " + bonus4);
        System.out.println("Este é o restante da divisão do seu bonus: " + bonus5);
        int contador = 0;
        System.out.println("Estado atual do contador: " + contador);
        contador += 1;
        System.out.println("Próximo estados do contador2: " + contador);
        contador++;
        System.out.println("Próximo estado do contador3: " + contador);
        contador--;
        System.out.println("Próximo estados do contador4: " + contador);
        ++contador;
        System.out.println("Próximo estados do contador5: " + contador);
        --contador;
        System.out.println("Próximo estados do contador6: " + contador);
        int contador2 = 0;
        System.out.println("Adição antes de imprimir: " + (++contador2));
        System.out.println("Adição depois de imprimir: " + (contador2++));
    }
}
