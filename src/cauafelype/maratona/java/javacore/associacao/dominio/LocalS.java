package cauafelype.maratona.java.javacore.associacao.dominio;

public class LocalS {
    private String endereco;

    public LocalS() {
    }

    public LocalS(String endereco) {
        this.endereco = endereco;
    }

    public void imprime() {
        System.out.println("Local: "+this.getEndereco());
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
