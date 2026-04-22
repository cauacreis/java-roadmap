package cauafelype.maratona.java.javacore.enumeracao.dominio;

public class Cliente {
    private String nome;
    private String tipo;
    public static final String PESSOA_FISICA = "PESSOA_FISICA";
    public static final String PESSOA_JURIDICA = "PESSOA_JURIDICA";

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", \ntipo='" + tipo + '\'' +
                '}';
    }

    public Cliente(String nome, String tipo) {
        if (!tipo.equalsIgnoreCase(PESSOA_FISICA) && !tipo.equalsIgnoreCase(PESSOA_JURIDICA)) {
            System.out.println("Você criou o objeto da forma errada, digite PESSOA_FISICA ou PESSOA_JURIDICA");
            return;
        }
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
