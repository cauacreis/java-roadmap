package cauafelype.maratona.java.devbooking.teste;

import cauafelype.maratona.java.devbooking.dominio.*;

import javax.xml.crypto.Data;
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
        Quarto quartosParaReservar2 = quartos.get(0);

        try {
            if(quartosParaReservar2.getStatusQuarto() != StatusQuarto.LIVRE) {
                throw new QuartoIndisponivelException("Este quarto está ocupado ou em manutenção, espere ele estar livre!");
            }
            Reserva quartoParaJoao = new Reserva(quartosParaReservar2, "Joao", hoje, dataReserva);
            System.out.println("Esta é a data do seu CheckIn:"+quartoParaJoao.getDataCheckIn());
            System.out.println("Esta é a data do seu CheckOut:"+quartoParaJoao.getDataCheckOut());
            quartoParaJoao.calcularTotal();
            quartosParaReservar2.setStatusQuarto(StatusQuarto.OCUPADO);
            System.out.println(quartosParaReservar2.getStatusQuarto());
        } catch (QuartoIndisponivelException | DatasInvalidasException e) {
            System.out.println(e.getMessage());
        }
        Quarto quartosParaReservar3 = quartos.get(1);
        LocalDate dataReservaPraTras = hoje.minusDays(7);

        try {
            if (quartosParaReservar3.getStatusQuarto() != StatusQuarto.LIVRE) {
                throw new QuartoIndisponivelException("Este quarto está indisponível!");
            }
            Reserva quartoParaJose = new Reserva(quartosParaReservar3, "Jose", hoje, dataReservaPraTras);
            System.out.println("Esta é a data do seu CheckIn:"+quartoParaJose.getDataCheckIn());
            System.out.println("Esta é a data do seu CheckOut:"+quartoParaJose.getDataCheckOut());
            quartoParaJose.calcularTotal();
            quartosParaReservar3.setStatusQuarto(StatusQuarto.OCUPADO);
            System.out.println(quartosParaReservar3.getStatusQuarto());
        } catch (QuartoIndisponivelException | DatasInvalidasException e) {
            System.out.println(e.getMessage());
        }
    }
}
