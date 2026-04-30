package cauafelype.maratona.java.javacore.enumeracao.dominio;

public enum StatusPedido {
    AGUARDANDO_PAGAMENTO(1),
    PREPARANDO(2),
    SAIU_PRA_ENTREGA(3),
    ENTREGUE(4);

    private double codigoBanco;

    StatusPedido(double codigoBanco) {
        this.codigoBanco = codigoBanco;
    }

    public static StatusPedido valueOf(double codigoBanco) {
        for (StatusPedido s : StatusPedido.values()) {
            if (s.codigoBanco == codigoBanco) {
                return s;
            } else {
                return null;
            }
        }
    }

    public double getCodigoBanco() {
        return codigoBanco;
    }
}
