package cauafelype.maratona.java.javacore.enumeracao.teste;

import java.util.ArrayList;
import java.util.List;
import cauafelype.maratona.java.javacore.enumeracao.dominio.Raridade;
import cauafelype.maratona.java.javacore.enumeracao.dominio.SkinCS2;

public class Skincs2teste2 {
    public static void main(String[] args) {
        List<SkinCS2> carrinhoDeCompras = new ArrayList<>();

        List<SkinCS2> pacoteDeArmas = List.of(
                new SkinCS2(120.0, "AK-47 Redline", Raridade.RESTRITO),
                new SkinCS2(850.0, "AWP Dragon Lore", Raridade.OCULTO),
                new SkinCS2(300.0, "M4A1-S Hyper Beast", Raridade.SECRETO),
                new SkinCS2(90.0, "USP-S Cortex", Raridade.RESTRITO),
                new SkinCS2(45.0, "Glock-18 Water Elemental", Raridade.MILITAR),
                new SkinCS2(60.0, "Desert Eagle Conspiracy", Raridade.RESTRITO),
                new SkinCS2(150.0, "AK-47 Frontside Misty", Raridade.SECRETO),
                new SkinCS2(700.0, "Karambit Fade", Raridade.OCULTO),
                new SkinCS2(200.0, "M4A4 Neo-Noir", Raridade.SECRETO),
                new SkinCS2(80.0, "Famas Roll Cage", Raridade.MILITAR),
                new SkinCS2(110.0, "Galil AR Chatterbox", Raridade.RESTRITO),
                new SkinCS2(500.0, "Butterfly Knife Slaughter", Raridade.OCULTO),
                new SkinCS2(130.0, "AK-47 Phantom Disruptor", Raridade.SECRETO),
                new SkinCS2(70.0, "P250 See Ya Later", Raridade.RESTRITO),
                new SkinCS2(40.0, "MP9 Hydra", Raridade.MILITAR),
                new SkinCS2(210.0, "AWP Neo-Noir", Raridade.SECRETO),
                new SkinCS2(600.0, "M9 Bayonet Doppler", Raridade.OCULTO),
                new SkinCS2(95.0, "SG 553 Pulse", Raridade.RESTRITO),
                new SkinCS2(55.0, "UMP-45 Primal Saber", Raridade.MILITAR),
                new SkinCS2(175.0, "AK-47 Neon Rider", Raridade.SECRETO),
                new SkinCS2(65.0, "Five-SeveN Angry Mob", Raridade.RESTRITO),
                new SkinCS2(720.0, "Talon Knife Marble Fade", Raridade.OCULTO),
                new SkinCS2(140.0, "M4A1-S Decimator", Raridade.SECRETO),
                new SkinCS2(50.0, "MAC-10 Disco Tech", Raridade.MILITAR),
                new SkinCS2(85.0, "CZ75-Auto Xiangliu", Raridade.RESTRITO),
                new SkinCS2(190.0, "AWP Fever Dream", Raridade.SECRETO),
                new SkinCS2(800.0, "Karambit Tiger Tooth", Raridade.OCULTO),
                new SkinCS2(100.0, "Famas Mecha Industries", Raridade.RESTRITO),
                new SkinCS2(35.0, "PP-Bizon High Roller", Raridade.MILITAR),
                new SkinCS2(160.0, "AK-47 Legion of Anubis", Raridade.SECRETO),
                new SkinCS2(75.0, "Tec-9 Fuel Injector", Raridade.RESTRITO),
                new SkinCS2(900.0, "Butterfly Knife Crimson Web", Raridade.OCULTO),
                new SkinCS2(220.0, "M4A4 The Emperor", Raridade.SECRETO),
                new SkinCS2(48.0, "MP7 Bloodsport", Raridade.MILITAR),
                new SkinCS2(115.0, "Desert Eagle Mecha Industries", Raridade.RESTRITO),
                new SkinCS2(250.0, "AWP Containment Breach", Raridade.SECRETO),
                new SkinCS2(650.0, "Bayonet Gamma Doppler", Raridade.OCULTO),
                new SkinCS2(88.0, "Nova Hyper Beast", Raridade.RESTRITO),
                new SkinCS2(42.0, "Sawed-Off Apocalypto", Raridade.MILITAR),
                new SkinCS2(180.0, "AK-47 Bloodsport", Raridade.SECRETO),
                new SkinCS2(95.0, "Glock-18 Vogue", Raridade.RESTRITO),
                new SkinCS2(780.0, "Skeleton Knife Fade", Raridade.OCULTO),
                new SkinCS2(205.0, "M4A1-S Player Two", Raridade.SECRETO),
                new SkinCS2(38.0, "P90 Shapewood", Raridade.MILITAR),
                new SkinCS2(125.0, "USP-S Kill Confirmed", Raridade.RESTRITO),
                new SkinCS2(260.0, "AWP Wildfire", Raridade.SECRETO),
                new SkinCS2(820.0, "Karambit Lore", Raridade.OCULTO),
                new SkinCS2(92.0, "Dual Berettas Cobra Strike", Raridade.RESTRITO),
                new SkinCS2(47.0, "XM1014 Incinegator", Raridade.MILITAR),
                new SkinCS2(170.0, "AK-47 Vulcan", Raridade.SECRETO) // O último não tem vírgula!
        );

        carrinhoDeCompras.addAll(pacoteDeArmas);

        System.out.println("\n🛒 --- SEU CARRINHO DE COMPRAS ---");
        System.out.println(" 🔹 Total de itens: " + carrinhoDeCompras.size());

        carrinhoDeCompras.forEach(skin ->
                System.out.println(" 🔹 " + skin.getNome() +
                        " | Raridade: " + skin.getRaridades() +
                        " | Valor Base: R$ " + skin.getPrecoBase() +
                        " | Valor c/ Taxa: R$ " + skin.calcularPrecoSkin())
        );
        System.out.println("\n----------------------------------");
        System.out.println(" 🔹 Agora as skins OCULTAS: ");
        carrinhoDeCompras.stream()
                        .filter(skin -> skin.getRaridades() == Raridade.OCULTO)
                        .forEach(skin -> System.out.println(" 🔪 " + skin.getNome() + " | R$ " + skin.calcularPrecoSkin()));
                        System.out.println("----------------------------------\n");
        List<SkinCS2> skinsDeElite = carrinhoDeCompras.stream()
        .filter(skin -> skin.getRaridades() == Raridade.OCULTO)
                .toList();
        System.out.println("\n----------------------------------");
        System.out.println(" 🔹 Agora as skins na nova LISTA: ");
        skinsDeElite.forEach((skin ->
                System.out.println(" 🔹 " + skin.getNome() +
                        " | Raridade: " + skin.getRaridades() +
                        " | Valor Base: R$ " + skin.getPrecoBase() +
                        " | Valor c/ Taxa: R$ " + skin.calcularPrecoSkin())
            )
        );
        System.out.println("\n🅰️ --- ARMAS COM A LETRA 'A' ---");
        carrinhoDeCompras.stream()
                .filter(skin -> skin.getNome().startsWith("A"))
                .forEach(skin -> System.out.println(" 🎯 " + skin.getNome()));
    }
}