package cauafelype.maratona.java.javacore.heranca.dominio;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;
    // protected faz com que seja trancado para o mundo alterar e liberado para os filhos alterar(quem der extend e for do mesmo pacote)
    public void imprime() {
        System.out.println("Nome do pessoa: "+this.nome);
        System.out.println("CPF do pessoa: "+this.cpf);
        System.out.println("Endereço da pessoa: "+this.endereco.getRua());
        System.out.println("Cep da pessoa: "+this.endereco.getCep());
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
