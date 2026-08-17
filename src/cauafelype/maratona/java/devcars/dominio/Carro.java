package cauafelype.maratona.java.devcars.dominio;

public class Carro extends Veiculo {
    private int quantidadePortas;

    public Carro(String marca, double valorDiaria, TipoCombustivel tipoCombustivel, int quantidadePortas) {
        super(marca, valorDiaria, tipoCombustivel);
        this.quantidadePortas = quantidadePortas;
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }
}
