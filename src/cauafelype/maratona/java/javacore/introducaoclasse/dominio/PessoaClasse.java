package cauafelype.maratona.java.javacore.introducaoclasse.dominio;

public class PessoaClasse {
    private String nome = "Indefinido";
    private int idade;
    private char sexo;

    public void imprime(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Sexo: " + this.sexo);
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        if (idade < 0){
            throw new IllegalArgumentException("Idade deve ser positiva");
        }
        this.idade = idade;
    }
    public void setSexo(char sexo){
        this.sexo = sexo;
    }
    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }
    public char getSexo(){
        return this.sexo;
    }
}
