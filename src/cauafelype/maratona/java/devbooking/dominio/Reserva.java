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
        System.out.println("Este é o total a ser pago: %.2f"+total);
        return total;
    }

    public String formatarData(LocalDate data) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Esta é a data que você deve entregar o quarto: dd/MM/yyyy: "+data);
        return data.format(formatter);
    }

    public Reserva(Quarto quarto, String nomeHospede, LocalDate dataCheckIn, LocalDate dataCheckOut) {
        this.quarto = quarto;
        this.nomeHospede = nomeHospede;
        this.dataCheckIn = dataCheckIn;
        this.dataCheckOut = dataCheckOut;
    }
}
