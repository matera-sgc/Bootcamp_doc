package bootcamp.doc.onze.lambdas;

import java.util.List;

public class TesteListComum {

    public static void main(String[] args) {
        System.out.println("Imprime todos os elementos da lista.");
        List<Integer> lista = List.of(1, 2, 3, 4, 5);

        for(Integer n : lista) {
            System.out.println(n);
        }

        System.out.println("Imprime todos os elementos da lista com lambda.");
        lista.forEach(n -> System.out.println(n));
    }

}
