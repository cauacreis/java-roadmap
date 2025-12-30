package cauafelype.maratona.java.introducao;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // int 4 bytes, double 8 bytes, float 4 bytes, char 2 bytes, byte 1 byte, short 2 bytes, long 8 bytes, boolean 1 bit
        int idade = 20;
        int forcarValor = (int) 10000000000000L;
        double salario = 1500.00;
        float preco = 1200.00f;
        // Use double por padrão para números decimais em java. Recorra ao float apenas se precisar economizar
        // memória e souber que a precisão de 7 dígitos é suficiente para a sua aplicação
        char sexo = 'M';
        boolean estado = true;
        byte internet = 127;
        short pequeno = 15;
        long grande = 100000;
        char asciiTable = 066;
        char unicodeTable = '\u0041';
        var cursoFaculdade = "Eng De Software";
        String nome = "Abreu Da Silva Pereira Pinto";
        // Primeira letra de cada palavra da variavel tem que ser miniscula ex: idadeDoPai
            System.out.println("Idade do usuário "+ idade);
            System.out.println("Salário do usuário "+ salario + "\nPreço do produto: "+ preco);
            System.out.println("Sexo do usuário "+ sexo);
            System.out.println(estado);
            System.out.println(internet);
            System.out.println(pequeno);
            System.out.println(grande);
            System.out.println(asciiTable);
            System.out.println(unicodeTable);
            System.out.println(forcarValor);
            System.out.println(nome);
            System.out.println(cursoFaculdade);
    }
}
