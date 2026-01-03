package cauafelype.maratona.java.introducao;

public class EstruturasCondicionaisIF {
    public static void main(String[] args) {
        if (true) {
            System.out.println("Dentro do if TRUE ");
        }
        System.out.println("Fora do if");
        if (false) {
            System.out.println("Dentro do if FALSO");
        }
        int idade = 15;
        if (idade >= 18) {
            System.out.println("Você pode comprar bebida");
        } else if (idade < 18) {
            System.out.println("Você não pode comprar bebida");
        }
        int anosDeIdade = 18;
        boolean isAutorizadoPraComprarBebida = idade >= 18;
        if (isAutorizadoPraComprarBebida) {
            System.out.println("Você é autorizado pra comprar bebida");
            // ! é a mesma coisa que escrever (!isAutorizadoPraComprarBebida == false)
        } else if (!isAutorizadoPraComprarBebida) {
            System.out.println("Você não é autorizado pra comprar bebida");
        }
    }
}
