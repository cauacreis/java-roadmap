package cauafelype.maratona.java.devbooking.teste;

import cauafelype.maratona.java.devbooking.dominio.Quarto;
import cauafelype.maratona.java.devbooking.dominio.QuartoPremium;
import cauafelype.maratona.java.devbooking.dominio.QuartoStandard;

import java.util.ArrayList;
import java.util.List;

public class QuartosTeste01 {
    public static void main(String[] args) {
        List<Quarto> quartos = new ArrayList<>();
        Quarto normal = new QuartoStandard(103, 299.99, false);
        Quarto premium = new QuartoPremium(103, 299.99, true);

        quartos.add(normal);
        quartos.add(premium);



    }
}
