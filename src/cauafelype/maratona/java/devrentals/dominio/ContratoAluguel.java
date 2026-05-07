package cauafelype.maratona.java.devrentals.dominio;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ContratoAluguel {
    private Equipamentos equipamentos;
    private LocalDate dataRetirada;
    private LocalDate dataDevolucao;

    public ContratoAluguel(Equipamentos equipamentos, LocalDate dataRetirada, LocalDate dataDevolucao) {
        this.equipamentos = equipamentos;
        this.dataRetirada = dataRetirada;
        this.dataDevolucao = dataDevolucao;
    }

    public void calcularValorTotal() {
        long diasAlugados = ChronoUnit.DAYS.between(dataRetirada, dataDevolucao);
        if (diasAlugados <= 0) {
            return diasAlugados * equipamentos.get
        }
    }
}
