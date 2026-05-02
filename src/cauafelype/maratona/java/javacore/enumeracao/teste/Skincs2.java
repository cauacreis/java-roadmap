package cauafelype.maratona.java.javacore.enumeracao.teste;
import java.util.ArrayList;
import java.util.List;
import cauafelype.maratona.java.javacore.enumeracao.dominio.Raridade;
import cauafelype.maratona.java.javacore.enumeracao.dominio.SkinCS2;

public class Skincs2 {
    public static void main(String[] args) {
        List<SkinCS2> carrinhoDeCompras = new ArrayList<>();
        SkinCS2 ak47 = new SkinCS2(199.00, "AK 47 Black Laminate", Raridade.MILITAR);
        SkinCS2 m4a4 = new SkinCS2(399, "M4A4 Asiimov", Raridade.MILITAR);
        carrinhoDeCompras.add(ak47);
        carrinhoDeCompras.add(m4a4);
        System.out.println("\n🛒 --- SEU CARRINHO DE COMPRAS ---");
        System.out.println(" 🔹 Total de itens: " + carrinhoDeCompras.size());
        carrinhoDeCompras.forEach(skin ->
                System.out.println(" 🔹 " + skin.getNome() +
                        " | Raridade: " + skin.getRaridades() +
                        " | Valor Base: R$ " + skin.getPrecoBase() +
                        " | Valor c/ Taxa: R$ " + skin.calcularPrecoSkin())
        );        System.out.println("----------------------------------\n");
    }
}
