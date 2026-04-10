package cauafelype.maratona.java.javacore.heranca.dominio;

public class Cardio extends AtividadeFisica{
    private double distanciaEmKm;

    public Cardio(String nome, int duracaoMinutos, double distanciaEmKm) {
        super(nome, duracaoMinutos);
        this.distanciaEmKm = distanciaEmKm;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Esta é a distância percorrida no Cárdio: "+this.distanciaEmKm);
        System.out.println("Essa atividade durou: "+this.duracaoMinutos+" minutos");
        System.out.println("Este foi o Cárdio feito: "+this.nome);
    }

    public double getDistanciaEmKm() {
        return distanciaEmKm;
    }

    public void setDistanciaEmKm(double distanciaEmKm) {
        this.distanciaEmKm = distanciaEmKm;
    }
}
