package cauafelype.maratona.java.devbooking.teste;

import cauafelype.maratona.java.devbooking.dominio.Quarto;
import cauafelype.maratona.java.devbooking.dominio.QuartoPremium;
import cauafelype.maratona.java.devbooking.dominio.QuartoStandard;
import cauafelype.maratona.java.devbooking.dominio.StatusQuarto;

import java.util.Scanner;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class QuartosTeste01 {
    public static void main(String[] args) {
        List<Quarto> quartos = new ArrayList<>();
        Quarto normal = new QuartoStandard(103, 299.99, StatusQuarto.LIVRE, false);
        Quarto premium = new QuartoPremium(103, 299.99, StatusQuarto.LIVRE, true);

        quartos.add(normal);
        quartos.add(premium);

        LocalDate hoje =  LocalDate.now();
        Scanner sc = new Scanner(System.in);
        System.out.println("Sua reserva vai durar quantos dias?");
        sc.nextLine();
        LocalDate dataReserva = hoje.plusDays(sc.nextInt());


    }
}
