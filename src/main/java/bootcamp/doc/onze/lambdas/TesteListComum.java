package bootcamp.doc.onze.lambdas;

import java.util.List;

/**
 * Compara iteração tradicional (for-each) com lambda (forEach).
 * - for(Type x : lista): forma imperativa/tradicional
 * - lista.forEach(x -> ...): forma funcional/lambda
 * Ambas fazem a mesma coisa, lambda é mais concisa.
 */
public class TesteListComum {

    public static void main(String[] args) {
        System.out.println("Imprime todos os elementos da lista.");
        List<Integer> lista = List.of(1, 2, 3, 4, 5);

        // Forma tradicional: for-each
        for(Integer n : lista) {
            System.out.println(n);
        }

        // Forma lambda: forEach
        System.out.println("Imprime todos os elementos da lista com lambda.");
        lista.forEach(n -> System.out.println(n));
    }

}
