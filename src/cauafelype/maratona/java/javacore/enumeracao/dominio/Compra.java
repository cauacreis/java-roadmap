package cauafelype.maratona.java.javacore.enumeracao.dominio;

public class Compra {
    private String nomeProduto;
    private double precoProduto;
    private TipoPagamento tipoPagamento;

    public Compra(String nomeProduto, double precoProduto, TipoPagamento tipoPagamento) {
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Compra{" +
                "nomeProduto='" + nomeProduto + '\'' +
                ", precoProduto=" + precoProduto +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }
    public void ImprimirRecibo() {
        double valorTaxa = this.tipoPagamento.calcularTaxa(this.precoProduto);
        System.out.println("--- RECIBO DA COMPRA ---");
        System.out.println("Produto: " + this.nomeProduto);
        System.out.println("Valor Original: R$ " + this.precoProduto);
        System.out.println("Pagamento escolhido: " + this.tipoPagamento);
        System.out.println("Resultado do cálculo do Enum: R$ " + valorTaxa);
        System.out.println("------------------------\n");
    }
}
