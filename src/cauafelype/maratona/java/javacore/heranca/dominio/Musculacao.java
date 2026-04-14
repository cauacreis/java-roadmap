package cauafelype.maratona.java.javacore.heranca.dominio;

public class Musculacao extends AtividadeFisica{
    private String grupoMuscular;
    static {
        System.out.println("5- lendo a planta");
    }

    {
        System.out.println("6- Bloco de instância");
    }

    // 7- Construtor
    public Musculacao(String nome, int duracaoMinutos, String grupoMuscular) {
        super(nome, duracaoMinutos);
        this.grupoMuscular = grupoMuscular;
    }

    @Override
    public void exibirDetalhes(){
        System.out.println("Essa atividade durou: "+this.duracaoMinutos+" minutos");
        System.out.println("Este foi o Cárdio feito: "+this.nome);
        System.out.println("Este foi o grupo muscular treinado: "+this.grupoMuscular);
    }

    public String getGrupoMuscular() {
        return grupoMuscular;
    }

    public void setGrupoMuscular(String grupoMuscular) {
        this.grupoMuscular = grupoMuscular;
    }
}
