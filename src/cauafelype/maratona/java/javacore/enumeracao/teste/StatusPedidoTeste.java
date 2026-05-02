package cauafelype.maratona.java.javacore.enumeracao.teste;
import cauafelype.maratona.java.javacore.enumeracao.dominio.StatusPedido;

public class StatusPedidoTeste {
    public static void main(String[] args) { 
        int numeroDoBanco = 3;
        StatusPedido statusPedido = StatusPedido.buscaPorCodigo(numeroDoBanco);
        System.out.println("O status do seu pedido eh: "+ statusPedido);
    }
}
