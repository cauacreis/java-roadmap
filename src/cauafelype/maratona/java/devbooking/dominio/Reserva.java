package cauafelype.maratona.java.devbooking.dominio;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Reserva {
    private int quarto;
    private String nomeHospede;
    private LocalDate dataCheckIn;
    private LocalDate dataCheckOut;

    public double calcularTotal (){
        long diasReservas = ChronoUnit.DAYS.between(dataCheckIn, dataCheckOut);
        double total = quarto*diasReservas;
        return total;
    }
}
