package cauafelype.maratona.java.javacore.heranca.dominio;

public final class Fusca extends Carro {
    private double preco;

    public Fusca(String modelo, String placa, int ano, String tipo, double preco) {
        super(modelo, placa, ano, tipo);
        this.preco = preco;
    }

    @Override
    public void imprime() {
        super.imprime();
        System.out.println("Este é o preço do seu fusca: "+this.preco);
    }

    @Override
    public void calcularImposto() {
        System.out.println("O imposto do Fusca é: "+this.preco * 0.10);
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
