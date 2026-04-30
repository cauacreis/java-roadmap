package cauafelype.maratona.java.javacore.enumeracao.dominio;

public enum StatusPedido {
    AGUARDANDO_PAGAMENTO(1),
    PREPARANDO(2),
    SAIU_PRA_ENTREGA(3),
    ENTREGUE(4);

    private int codigoBanco;

    StatusPedido(int codigoBanco) {
        this.codigoBanco = codigoBanco;
    }

    public static StatusPedido buscaPorCodigo(int codigoBanco) {
        for (StatusPedido s : StatusPedido.values()) {
            if (s.codigoBanco == codigoBanco) {
                return s;
            }
        }
        return null;
    }

    public int getCodigoBanco() {
        return codigoBanco;
    }
}
