package cauafelype.maratona.java.javacore.heranca.dominio;

public final class CrossFit extends AtividadeFisica{
    private int treinosDoDia;

    @Override
    public void exibirDetalhes() {
        System.out.println("Essa atividade durou: "+this.duracaoMinutos+" minutos");
        System.out.println("Este foi o Cárdio feito: "+this.nome);
        System.out.println("Essa foi a quantidade de treinos do dia: "+this.treinosDoDia);
    }

    public CrossFit(String nome, int duracaoMinutos, int  treinosDoDia) {
        super(nome, duracaoMinutos);
        this.treinosDoDia = treinosDoDia;
    }

    public int getTreinosDoDia() {
        return treinosDoDia;
    }

    public void setTreinosDoDia(int treinosDoDia) {
        this.treinosDoDia = treinosDoDia;
    }
}
