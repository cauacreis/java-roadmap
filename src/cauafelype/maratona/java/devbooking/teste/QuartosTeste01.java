package cauafelype.maratona.java.devbooking.teste;

import cauafelype.maratona.java.devbooking.dominio.*;

import java.sql.SQLOutput;
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
        LocalDate dataReserva = hoje.plusDays(7);

        Quarto quartosParaReservar = quartos.get(0);

        try {
            if(quartosParaReservar.getStatusQuarto() != StatusQuarto.LIVRE) {
                throw new QuartoIndisponivelException("Este quarto está ocupado ou em manutenção, espere ele estar livre!");
            }
            Reserva quartoParaPedro = new Reserva(quartosParaReservar, "Pedro", hoje, dataReserva);
            System.out.println("Esta é a data do seu CheckIn:"+quartoParaPedro.getDataCheckIn());
            System.out.println("Esta é a data do seu CheckOut:"+quartoParaPedro.getDataCheckOut());
            quartoParaPedro.calcularTotal();
            quartosParaReservar.setStatusQuarto(StatusQuarto.OCUPADO);
            System.out.println(quartosParaReservar.getStatusQuarto());
        } catch (QuartoIndisponivelException e) {
            System.out.println(e.getMessage());
        }
    }
}
