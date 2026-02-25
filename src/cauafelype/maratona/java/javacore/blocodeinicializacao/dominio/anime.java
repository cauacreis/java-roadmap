package cauafelype.maratona.java.javacore.blocodeinicializacao.dominio;

public class anime {
    String nome;
    private int[] eps;
// bloco de inicialização de instância
    {
        System.out.println("Dentro do bloco de inicialização");
        eps = new int[100];
        for (int i = 0; i < eps.length; i++) {
            eps[i] = i+1;
        }
    }

    public anime(String nome) {
        this.nome = nome;
    }

    public anime() {
        for (int i = 0; i < eps.length; i++) {
            System.out.println("Epsódio: "+eps[i]);
        }
    }

    public String getNome() {
        return nome;
    }

    public int[] getEps() {
        return eps;
    }
}
