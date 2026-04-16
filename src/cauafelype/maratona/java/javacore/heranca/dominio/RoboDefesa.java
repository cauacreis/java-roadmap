package cauafelype.maratona.java.javacore.heranca.dominio;

public final class RoboDefesa extends Robo{
    private int nivelEscudo;

    public RoboDefesa(String nome,  int nivelEscudo) {
        super(nome);
        this.nivelEscudo = nivelEscudo;
    }
    @Override
    public void carregarDados() {
        System.out.println("--- Carregando dados do robo de defesa ---");
        System.out.println("Nome: " + this.nome);
        System.out.println("Nível de defesa: " + this.nivelEscudo);
        System.out.println("Nível de bateria: "+ this.nivelBateria);
    }

    @Override
    public void atacar() {
        System.out.println(""+this.nome+" ativou o escudo nível: "+nivelEscudo+"DEF"+" e contra-atacou!\n");
    }

    public int getNivelEscudo() {
        return nivelEscudo;
    }

    public void setNivelEscudo(int nivelEscudo) {
        this.nivelEscudo = nivelEscudo;
    }
}
