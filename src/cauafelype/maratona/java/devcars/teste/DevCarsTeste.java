package cauafelype.maratona.java.devcars.teste;

import cauafelype.maratona.java.devcars.dominio.Aluguel;
import cauafelype.maratona.java.devcars.dominio.Carro;
import cauafelype.maratona.java.devcars.dominio.TipoCombustivel;
import cauafelype.maratona.java.devcars.dominio.Veiculo;

public class DevCarsTeste {
    public static void main(String[] args) {

        Veiculo tesla = new Carro("Tesla Model 3", 300, TipoCombustivel.FLEX, 4);

        Aluguel PedroContrato = new Aluguel(tesla, 10);

        System.out.println("Pedro Contrato: " + PedroContrato.toString());
        System.out.printf("Total a pagar: R$ %.2f\n",PedroContrato.calcularTotal());
        System.out.printf("Total de imposto a ser pago: R$ %.2f\n",PedroContrato.calcularImposto());
    }
}
