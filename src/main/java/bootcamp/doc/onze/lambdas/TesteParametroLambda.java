package bootcamp.doc.onze.lambdas;

import java.util.List;
import java.util.function.IntFunction;

public class TesteParametroLambda {

    public static void main(String[] args) {
        realizaOperacao(List.of(1, 2, 3, 4, 5), n -> n + 1);
    }

    private static void realizaOperacao(List<Integer> lista, IntFunction<Integer> funcao) {
        lista.forEach(n -> {
            n = funcao.apply(n);
            System.out.println(n);
        });
    }

}
