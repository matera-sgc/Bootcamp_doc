package bootcamp.doc.onze.lambdas;

import java.util.List;
import java.util.function.IntFunction;

/**
 * Demonstra lambda como parâmetro de método.
 * - IntFunction<Integer>: interface funcional que recebe int e retorna Integer
 * - O comportamento é passado como argumento (estratégia)
 * - Aqui: a operação é 'n + 1' (incrementa cada elemento)
 */
public class TesteParametroLambda {

    public static void main(String[] args) {
        // Passa a função 'n -> n + 1' como parâmetro
        realizaOperacao(List.of(1, 2, 3, 4, 5), n -> n + 1);
    }

    // Recebe uma lista E uma função (comportamento parametrizado)
    private static void realizaOperacao(List<Integer> lista, IntFunction<Integer> funcao) {
        lista.forEach(n -> {
            n = funcao.apply(n); // Aplica a função a cada elemento
            System.out.println(n);
        });
    }

}
