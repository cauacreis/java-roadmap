package cauafelype.maratona.java.javacore.associacao.dominio;

// sistema que gerencie seminários
// o sistema deverá cadastrar seminários, estudantes, professores e local onde será realizado
// um aluno poderá estar em apenas um seminário 1:1
// um seminário poderá ter nenhum ou vários alunos 0: N
// um professor poderá ter vários seminários
// um seminário deve ter um local

// campos básicos excluindo relacionamentos
// seminário: título
// aluno: nome e idade
// professor: nome, especialidade
// local: endereço

public class AlunoS {
    private String nome;
    private int idade;
    private SeminarioS seminario;


    public AlunoS(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public AlunoS() {
    }

    public void imprime() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        if (seminario != null) {
            System.out.println("Seminário: " + this.seminario.getTitulo());
        } else {
            System.out.println("Aluno sem seminário cadastrado");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public SeminarioS getSeminario() {
        return seminario;
    }

    public void setSeminario(SeminarioS seminario) {
        this.seminario = seminario;
    }
}
