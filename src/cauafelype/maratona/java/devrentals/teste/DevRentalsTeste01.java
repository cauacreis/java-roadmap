package cauafelype.maratona.java.devrentals.teste;

import cauafelype.maratona.java.devrentals.dominio.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DevRentalsTeste01 {
    public static void main(String[] args) {

        List<Equipamentos> lista = new ArrayList<>();
        Equipamentos placaDeVideo = new placaDeVideo("RTX3050", 100, true);
        Equipamentos xbox360 = new Console("XBOX 360", 50, true, "geração 360");
        lista.add(placaDeVideo);
        lista.add(xbox360);

        LocalDate hoje = LocalDate.now();
        LocalDate devolucao7Dias = hoje.plusDays(7);

        Equipamentos equipamentoParaAlugar = lista.get(0);

        try {
            ContratoAluguel alugarPlacaDeVideo = new ContratoAluguel(equipamentoParaAlugar, hoje, devolucao7Dias);
            if (!equipamentoParaAlugar.isDisponivel()) {
                throw new EquipamentoIndisponivelException("Este equipamento não está disponível! ");
            }
            System.out.println("Equipamento: " + alugarPlacaDeVideo.getEquipamentos().getNome());
            System.out.println("Esta é a data de retirada: " + alugarPlacaDeVideo.getDataRetirada());
            System.out.println("Esta é a data para devolução: " + alugarPlacaDeVideo.getDataDevolucao());
            System.out.println("Este é o preço a pagar pelo aluguel de 7 dias: " + alugarPlacaDeVideo.calcularValorTotal());
            equipamentoParaAlugar.setDisponivel(false);

        } catch (EquipamentoIndisponivelException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("\nDevRentals: Sistema operando normalmente.");
        Equipamentos outraCaraTentantoAlugarAMesmaPlaca = lista.get(0);
        try {
            if (!equipamentoParaAlugar.isDisponivel()) {
                throw new EquipamentoIndisponivelException("Este equipamento não está disponível! ");
            }
                ContratoAluguel alugarPlacaDeVideo2 = new ContratoAluguel(outraCaraTentantoAlugarAMesmaPlaca, hoje, devolucao7Dias);
                equipamentoParaAlugar.setDisponivel(false);
                System.out.println("Aluguel realizado com sucesso! Valor: R$ " + alugarPlacaDeVideo2.calcularValorTotal());
            System.out.println("Equipamento: " + alugarPlacaDeVideo2.getEquipamentos().getNome());
            System.out.println("Esta é a data de retirada: " + alugarPlacaDeVideo2.getDataRetirada());
            System.out.println("Esta é a data para devolução: " + alugarPlacaDeVideo2.getDataDevolucao());
            equipamentoParaAlugar.setDisponivel(false);
        } catch (EquipamentoIndisponivelException e) {
                System.out.println(e.getMessage());
            }
    }
}
