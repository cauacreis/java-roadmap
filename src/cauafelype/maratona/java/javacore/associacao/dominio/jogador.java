package cauafelype.maratona.java.javacore.associacao.dominio;

public class jogador {
    private String nome;
    private Time time;

    // Associação Unidirecional
    // Por exemplo, dentro de uma empresa, a pessoa só pode participar de um departamento
    // Se você compra um carro, ele perde a uma pessoa só, você
    // Esse tipo de relacionamento é associação
    // Jogador 1 -- Personagem
    // Time 1 -- Jogador
    // Jogador N -- 1 time
    // Estudante N -- N curso


    public void imprime() {
        System.out.println("Nome: " + nome);
        if (time != null) {
            System.out.println("Time: " + time.getNome());
        } else {
            System.out.println("Time: sem time (Jogador livre)");
        }
    }

    public jogador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public Time getTime() {
        return time;
    }
    public void setTime(Time time) {
        this.time = time;
    }
}
