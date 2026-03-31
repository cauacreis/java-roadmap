package cauafelype.maratona.java.javacore.heranca.dominio;

public final class Ferrari extends Carro {
    private double preco;

    public Ferrari(String modelo, String placa, int ano, String tipo, double preco) {
        super(modelo, placa, ano, tipo);
        this.preco = preco;
    }


    // se o metodo imprime na classe pai, fosse final, o metodo seria inalteravel, mesma coisa, quando coloca final numa variavel,seu valor
    // fica inalteravel
    // agora numa classe, ela se torna a última da árvore genealogica dela
    @Override
    public void imprime() {
        super.imprime();
        System.out.println("Este é o preço da sua ferrari: "+this.preco);
    }
    public void calcularImposto(){
        System.out.println("O imposto do carro é: "+(this.preco * 0.10));
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
