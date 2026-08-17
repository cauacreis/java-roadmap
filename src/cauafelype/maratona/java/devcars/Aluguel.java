package cauafelype.maratona.java.devcars;

import cauafelype.maratona.java.devbooking.dominio.DatasInvalidasException;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Aluguel {
    private  Veiculo veiculo;
    private LocalDate dataRetirada;
    private LocalDate dataDevolucao;

    public Aluguel(Veiculo veiculo, LocalDate dataRetirada, LocalDate dataDevolucao) {

        if (dataRetirada.isEqual(dataDevolucao) || dataDevolucao.isBefore(dataRetirada)) {
            throw new DatasInvalidasException("Erro: a devolução deve ocorrer pelo menos 1 dia depois da retirada!");
        }

        this.veiculo = veiculo;
        this.dataRetirada = dataRetirada;
        this.dataDevolucao = dataDevolucao;
    }
}
