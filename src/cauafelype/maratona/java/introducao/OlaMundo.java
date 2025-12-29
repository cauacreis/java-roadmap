package cauafelype.maratona.java.introducao;

    /**
 * Classe de exemplo utilizada para demonstrar:
 * <ul>
 *     <li>A estrutura básica de uma aplicação Java</li>
 *     <li>O uso correto de JavaDoc para documentação</li>
 *     <li>A diferença entre comentários comuns e JavaDoc</li>
 * </ul>
 *
 * <p>
 * Em projetos reais, evita-se o uso excessivo de comentários comuns,
 * pois um código bem escrito deve ser autoexplicativo. O JavaDoc deve
 * ser utilizado para documentar o propósito da classe, métodos e
 * decisões importantes de design.
 * </p>
 *
 * @author Cauã Felype
 */
public class OlaMundo {

    // Comentário de uma linha:
    // Usado aqui apenas para fins didáticos.
    // Em código profissional, nomes claros de classes e métodos
    // devem eliminar a necessidade desse tipo de comentário.

    /*
     * Comentário de múltiplas linhas:
     * Também utilizado apenas como exemplo educacional.
     * Não é recomendado para explicar lógica simples, pois
     * tende a ficar desatualizado e poluir a leitura do código.
     */

    public static void main(String[] args) {
        // A linha abaixo é autoexplicativa e não precisa de comentários.
        // O nome do método e da classe já indicam o que está sendo feito.
        System.out.println("Hello World");
    }
}

/*
 * Observação importante:
 * Comentários comuns não devem ser usados para explicar o "o que" o código faz.
 * Se for necessário documentar comportamento, regras de negócio ou decisões
 * técnicas, o JavaDoc é a abordagem correta.
 */
