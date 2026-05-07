package cauafelype.maratona.java.devrentals.teste;

import cauafelype.maratona.java.devrentals.dominio.Console;
import cauafelype.maratona.java.devrentals.dominio.Equipamentos;
import cauafelype.maratona.java.devrentals.dominio.placaDeVideo;

import java.util.ArrayList;
import java.util.List;

public class DevRentalsTeste01 {
    public static void main(String[] args) {
        List<Equipamentos> lista = new ArrayList<>();
        Equipamentos placaDeVideo = new placaDeVideo("RTX3050", 100, true);
        Equipamentos xbox360 = new Console("XBOX 360", 50, true, "geração 360");
        lista.add(placaDeVideo);
    }
}
