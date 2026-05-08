package cauafelype.maratona.java.devrentals.dominio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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

    public double calcularValorTotal() {
        long diasAlugados = ChronoUnit.DAYS.between(dataRetirada, dataDevolucao);
        if (diasAlugados <= 0){
        diasAlugados = 1;
        }
        return diasAlugados * equipamentos.getValorDiaria();
    }
    public String formatarData(LocalDate data) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return data.format(formatter);
    }

    public void processarDevolucao(LocalDate dataRealDevolucao) {
        System.out.println("Esta é a data de devolução do seu equipamento: "+formatarData(dataDevolucao));

        if (dataRealDevolucao.isAfter(dataDevolucao)) {
            long diasAtraso =  ChronoUnit.DAYS.between(dataDevolucao, dataRealDevolucao);

            double valorMultaPorDia = getEquipamentos().getValorDiaria() * 1.50;
            double totalMulta = valorMultaPorDia * diasAtraso;

            System.out.println("Atraso detectado, quantidade de dias atrasados: "+diasAtraso);
            System.out.println("Este é o valor total a ser pago: "+totalMulta);
        } else {
            long diasAlugados = ChronoUnit.DAYS.between(dataRetirada, dataDevolucao);
            System.out.println("Equipamento devolvido dentro da data de devolução\n preço sem multas: "+getEquipamentos().getValorDiaria() * diasAlugados);
        }
        getEquipamentos().setDisponivel(true);

    }

    public Equipamentos getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(Equipamentos equipamentos) {
        this.equipamentos = equipamentos;
    }

    public LocalDate getDataRetirada() {
        return dataRetirada;
    }

    public void setDataRetirada(LocalDate dataRetirada) {
        this.dataRetirada = dataRetirada;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
}
