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
            if(quartosParaReservar.getStatusQuarto().equals(StatusQuarto.OCUPADO) || quartosParaReservar.getStatusQuarto().equals(StatusQuarto.MANUTENCAO)) {
                throw new QuartoIndisponivelException("Este quarto está ocupado ou em manutenção, espere ele estar livre!");
            }
            Reserva quartoPadrao = new  Reserva(quartosParaReservar, "Pedro", hoje, dataReserva);
            quartoPadrao.calcularTotal();
            quartoPadrao.formatarData(dataReserva);
        } catch (QuartoIndisponivelException e) {
            System.out.println(e.getMessage());
        }
    }
}
