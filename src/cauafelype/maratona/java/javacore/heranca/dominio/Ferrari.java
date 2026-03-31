package cauafelype.maratona.java.javacore.heranca.dominio;

public final class Ferrari extends Carro {
    private double preco;

    public Ferrari(String modelo, String placa, int ano, String tipo, double preco) {
        super(modelo, placa, ano, tipo);
        this.preco = preco;
    }

    @Override
    public void imprime() {
        super.imprime();
        System.out.println("Este é o preço da sua ferrari: "+this.preco);
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
