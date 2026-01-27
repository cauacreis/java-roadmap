package cauafelype.maratona.java.javacore.introducaoclasse.testes;

import java.util.Scanner;
import cauafelype.maratona.java.javacore.introducaoclasse.dominio.CarroClasse;

public class CarroTeste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Criando os objetos (As duas TVs 📺)
        CarroClasse carro1 = new CarroClasse();
        CarroClasse carro2 = new CarroClasse();

        // --- CADASTRO DO PRIMEIRO CARRO ---
        System.out.println("=== CADASTRO DO CARRO 01 ===");
        System.out.print("Marca: ");
        carro1.marca = input.next();

        System.out.print("Modelo: ");
        carro1.modelo = input.next();

        System.out.print("Ano: ");
        carro1.ano = input.nextInt();

        System.out.print("Valor: ");
        carro1.valor = input.nextDouble();

        System.out.print("Cor: ");
        carro1.cor = input.next();

        System.out.print("Placa: ");
        carro1.placa = input.next();


        // --- CADASTRO DO SEGUNDO CARRO ---
        System.out.println("\n=== CADASTRO DO CARRO 02 ===");
        System.out.print("Marca: ");
        carro2.marca = input.next();

        System.out.print("Modelo: ");
        carro2.modelo = input.next();

        System.out.print("Ano: ");
        carro2.ano = input.nextInt();

        System.out.print("Valor: ");
        carro2.valor = input.nextDouble();

        System.out.print("Cor: ");
        carro2.cor = input.next();

        System.out.print("Placa: ");
        carro2.placa = input.next();

        // --- RELATÓRIO FINAL ---
        System.out.println("\n---------------- RELATÓRIO DE FROTA ----------------");

        System.out.println("CARRO 1:");
        System.out.println("Marca: " + carro1.marca + " | Modelo: " + carro1.modelo + " | Placa: " + carro1.placa);
        System.out.println("Ano: " + carro1.ano + " | Cor: " + carro1.cor + " | Valor: R$ " + carro1.valor);

        System.out.println("\nCARRO 2:");
        System.out.println("Marca: " + carro2.marca + " | Modelo: " + carro2.modelo + " | Placa: " + carro2.placa);
        System.out.println("Ano: " + carro2.ano + " | Cor: " + carro2.cor + " | Valor: R$ " + carro2.valor);
        System.out.println("----------------------------------------------------");

        input.close();
    }
}