package cauafelype.maratona.java.javacore.enumeracao.teste;

public class TryTesteServerValve {
    public static void main(String[] args) {
        try {
            int erroProposital = 10/0;

            System.out.println("Tentando entrar no server da valve: ");
        } catch (ArithmeticException excesao) {
            System.out.println("OPS! Houve um erro na sua tentativa de entrar no server da valde!");
            System.out.println("Este foi o erro: "+excesao.getMessage());
        }
        try {
            int nivelPessoa = 5;

            if(nivelPessoa < 10){
                throw new RuntimeException("O seu nível é baixo demais para acessar esta área!");
            }
            System.out.println("Conexão estabelecida no servidor da valve!");
        } catch (RuntimeException excecao) {
            System.out.println("CONEXÃO PERDIDA, eis aqui o motivo: "+excecao.getMessage());
        }
    }
}
