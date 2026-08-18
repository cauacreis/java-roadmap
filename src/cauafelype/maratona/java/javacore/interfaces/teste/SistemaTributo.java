package cauafelype.maratona.java.javacore.interfaces.teste;

import cauafelype.maratona.java.javacore.interfaces.dominio.CarroTributo;
import cauafelype.maratona.java.javacore.interfaces.dominio.NotebookTributo;
import cauafelype.maratona.java.javacore.interfaces.dominio.Tributavel;

import java.util.ArrayList;
import java.util.List;

public class SistemaTributo {
    public static void main(String[] args) {
        NotebookTributo mac = new NotebookTributo(10000, "mac");
        CarroTributo Tesla = new CarroTributo(1000000, "Tesla");

        List<Tributavel> listaParaTaxar = new ArrayList<>();
        listaParaTaxar.add(Tesla);
        listaParaTaxar.add(mac);

        System.out.println("Sistema de cobrança ativado");
        double totalArrecadado = 0;

        for (Tributavel t : listaParaTaxar) {
            double impostoCobrado = t.calcularImposto();
            System.out.println("Imposto: " + impostoCobrado + "\nDo item: "+t.getDescricaoDoItem());
            totalArrecadado += impostoCobrado;
            System.out.println("Próximo item\n");
        }
        System.out.println("Lista finalizada de cobrança!");
        System.out.println("Total: " + totalArrecadado);
    }
}
