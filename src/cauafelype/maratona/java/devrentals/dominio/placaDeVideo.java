package cauafelype.maratona.java.devrentals.dominio;

public class placaDeVideo extends Equipamentos {
    private int memoriaVram;

    public placaDeVideo(String nome, double valorDiaria, boolean disponivel) {
        super(nome, valorDiaria, disponivel);
    }

    public int getMemoriaVram() {
        return memoriaVram;
    }

    public void setMemoriaVram(int memoriaVram) {
        this.memoriaVram = memoriaVram;
    }
}
