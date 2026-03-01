package cauafelype.maratona.java.javacore.modificadorestatico.dominio;

public class Carro {
    private String marca;
    private String modelo;
    private double velocidadeMax;
    public static final double VELOCIDADE_LIMITE = 250;
    // final significa que é imutável e não pertence ao objetivo e sim a classe, ela é uma constante
    // por isso ela é escrita em letra maíuscula e com underline,
    // mas você pode utilizar ele sem o final, para caso você deseja alterar o valor dele, fora do código domínio

    public Carro(String marca, String modelo, double velocidadeMax) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadeMax = velocidadeMax;
    }

    public void imprime() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidade max: " + velocidadeMax+ " Km/h");
        System.out.println("Velocidade limite do acordo alemão entre cavalheiros: " + VELOCIDADE_LIMITE + " Km/h");
        System.out.println("--------------------------------------------------------------------");
    }
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(double velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }
}
