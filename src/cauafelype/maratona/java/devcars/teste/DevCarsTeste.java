package cauafelype.maratona.java.devcars.teste;

import cauafelype.maratona.java.devcars.dominio.Carro;
import cauafelype.maratona.java.devcars.dominio.TipoCombustivel;
import cauafelype.maratona.java.devcars.dominio.Veiculo;

import java.time.LocalDate;

public class DevCarsTeste {
    public static void main(String[] args) {

        Veiculo tesla = new Carro("Tesla Model 3", 300, TipoCombustivel.FLEX, 4);
    }
}
