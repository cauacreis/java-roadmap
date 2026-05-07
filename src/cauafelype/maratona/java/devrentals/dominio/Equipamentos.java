package cauafelype.maratona.java.devrentals.dominio;

public abstract class Equipamentos {
    private String nome;
    private double valorDiaria;
    private boolean disponivel = true;

    public Equipamentos(String nome, double valorDiaria, boolean disponivel) {
        this.nome = nome;
        this.valorDiaria = valorDiaria;
        this.disponivel = disponivel;
    }

    public String getNome() {
        return nome;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
