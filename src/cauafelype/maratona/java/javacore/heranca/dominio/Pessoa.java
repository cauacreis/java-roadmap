package cauafelype.maratona.java.javacore.heranca.dominio;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;
    static {
        System.out.println("Dentro do bloco de inicialização ESTÁTICO de Pessoa");
    }
    {
        System.out.println("Dentro do bloco de inicialização de INSTÂNCIA de Pessoa");
    }
    // protected faz com que seja trancado para o mundo alterar e liberado para os filhos alterar(quem der extend e for do mesmo pacote)
    public void imprime() {
        System.out.println("Nome do pessoa: "+this.nome);
        System.out.println("CPF do pessoa: "+this.cpf);
        System.out.println("Endereço da pessoa: "+this.endereco.getRua());
        System.out.println("Cep da pessoa: "+this.endereco.getCep());
    }

    // outro construtor de exemplo
    public Pessoa (String nome) {
        this.nome = nome;
    }
    public Pessoa(String nome, String cpf) {
        this(nome); //isso vc puxar o outro construtor
        System.out.println("dentro do construtor da pessoa");
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
