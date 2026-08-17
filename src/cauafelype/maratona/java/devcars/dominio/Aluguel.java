package cauafelype.maratona.java.devcars.dominio;

import cauafelype.maratona.java.devbooking.dominio.DatasInvalidasException;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Aluguel implements Tributavel {
    private Veiculo veiculo;
    private LocalDate dataRetirada;
    private LocalDate dataDevolucao;

    public Aluguel(Veiculo veiculo, int diasAluguel) {

        if (diasAluguel <= 0) {
            throw new DatasInvalidasException("Erro: o aluguel deve durar pelo menos 1 dia");
        }

        this.veiculo = veiculo;
        this.dataRetirada = LocalDate.now();
        this.dataDevolucao = this.dataRetirada.plusDays(diasAluguel);
    }

    public double calcularTotal() {
        long dias = ChronoUnit.DAYS.between(dataRetirada, dataDevolucao);
        double valorBase = dias * veiculo.getValorDiaria();
        return veiculo.getTipoCombustivel().calcularDescontoAmbiental(valorBase);
    }

    @Override
    public String toString() {
        return "Aluguel{" +
                "\nveiculo=" + getVeiculo().getMarca() +
                "\ndataRetirada = " + getDataRetirada() +
                "\ndataDevolucao = " + getDataDevolucao() +
                '}';
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

    @Override
    public double calcularImposto() {
        return calcularTotal() * 0.05;
    }
}
