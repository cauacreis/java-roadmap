package cauafelype.maratona.java.devbooking.dominio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Reserva {
    private Quarto quarto;
    private String nomeHospede;
    private LocalDate dataCheckIn;
    private LocalDate dataCheckOut;

    public double calcularTotal (){
        long diasReservas = ChronoUnit.DAYS.between(dataCheckIn, dataCheckOut);
        double total = quarto.getValorDiaria() * diasReservas;
        return total;
    }

    public String formatarData(LocalDate data) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return data.format(formatter);
    }

    public Reserva(Quarto quarto, String nomeHospede, LocalDate dataCheckIn, LocalDate dataCheckOut) {
        this.quarto = quarto;
        this.nomeHospede = nomeHospede;
        this.dataCheckIn = dataCheckIn;
        this.dataCheckOut = dataCheckOut;
    }
}
