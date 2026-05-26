package bootcamp.doc.sete.equals_igualigual;

/**
 * Demonstra a diferença entre == e .equals() para Strings:
 * - == compara REFERÊNCIAS (endereços de memória)
 * - .equals() compara CONTEÚDO (valores)
 *
 * String Pool: literais iguais apontam para o MESMO objeto na memória.
 * 'new String()' força criação de objeto NOVO (referência diferente).
 */
public class TesteEqualsEIgualIgual {

    public static void main(String[] args) {
        String tipoConta1 = "Poupanca"; // String Pool
        String tipoConta2 = "Poupanca"; // Mesma referência do Pool
        String tipoConta3 = new String("Poupanca"); // Novo objeto na heap

        // true: ambos apontam para o mesmo objeto no Pool
        System.out.println("(tipoConta1 == tipoConta2) ->" + (tipoConta1 == tipoConta2));
        // false: referências diferentes (Pool vs Heap)
        System.out.println("(tipoConta1 == tipoConta3) ->" + (tipoConta1 == tipoConta3));
        // true: conteúdo é igual
        System.out.println("tipoConta1.equals(tipoConta2) ->" + tipoConta1.equals(tipoConta2));
        // true: conteúdo é igual, independente da referência
        System.out.println("tipoConta1.equals(tipoConta3) ->" + tipoConta1.equals(tipoConta3));
    }

}
