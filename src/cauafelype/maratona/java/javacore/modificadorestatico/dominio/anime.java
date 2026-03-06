package cauafelype.maratona.java.javacore.modificadorestatico.dominio;

public class anime {
    String nome;
    private static int[] eps;

     // 0 - bloco de inicializacao é executado quando a JVM carregar a classe
     // 1 - alocado espaço em memória pro objeto
     // 2 - cada atributo da classe é criado e inicializado com valores default ou o que for definido
     // 3- bloco de inicializacao é executado
     // 4- construtor é executado
    static {
        System.out.println("Dentro do bloco de inicialização");
        eps = new int[100];
        for (int i = 0; i < eps.length; i++) {
            eps[i] = i+1;
        }
    }
    static {
        System.out.println("Dentro do bloco de inicialização 2");
    }
    static {
        System.out.println("Dentro do bloco de inicialização 3");
    }

    public anime(String nome) {
        this.nome = nome;
    }

    public anime() {
        System.out.print("Episódios: ");
        for (int i = 0; i < eps.length; i++) {
            System.out.print(" "+eps[i]);
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEps() {
        return eps;
    }
}
