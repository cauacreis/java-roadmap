package cauafelype.maratona.java.javacore.enumeracao.dominio;

public enum TipoConta {
    POUPANCA,
    CORRENTE,
    SALARIO,
}
// enum é utilizado para sistemas pequenos
// agora o polimorfismo é utilizado para sistemas maiores
// No mercado de trabalho, a Opção B (Polimorfismo) é a mais usada para sistemas gigantes,
// porque se o banco inventar a "Conta Salário", você não precisa abrir a classe Conta original
// e botar mais um else if. Você só cria um filho novo! Mas para sistemas menores,
// a Opção A (com Enum) é super rápida e resolve o problema muito bem.

// o enum pode estar dentro de uma classe normal tbm, por exemplo:
// public class Cliente {
// public enum TipoConta {
// POUPANCA, CORRENTE, SALARIO
// }
// só que é um jeito mais feito e mais desorganizado não tão comum usado para utilizar enum