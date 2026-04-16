package cauafelype.maratona.java.javacore.heranca.dominio;

public final class RoboDefesa extends Robo{
    private int nivelEscudo;

    public RoboDefesa(String nome,  int nivelEscudo) {
        super(nome);
    }

    @Override
    public void atacar() {
        System.out.println(""+this.nome+" ativou o escudo nível: "+nivelEscudo+"DEF"+" e contra-atacou!");
    }
}
