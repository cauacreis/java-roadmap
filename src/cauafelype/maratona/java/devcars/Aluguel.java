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

    public double calcularTotal() {
        long dias = ChronoUnit.DAYS.between(dataRetirada, dataDevolucao);
        double valorBase = dias * veiculo.getValorDiaria();
        return veiculo.getTipoCombustivel().calcularDescontoAmbiental(valorBase);
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public LocalDate getDataRetirada() {
        return dataRetirada;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }
}
