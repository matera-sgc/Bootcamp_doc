package bootcamp.doc.nove.stream;

import java.util.List;
import java.util.stream.Stream;

/**
 * Demonstra a criação básica de um Stream a partir de uma List.
 * - stream(): converte a coleção em um fluxo de dados
 * - Stream permite operações funcionais (filter, map, reduce)
 * - Streams são lazy: só processam quando uma operação terminal é chamada
 */
public class TesteStream {

    public static void main(String[] args) {
        List<String> lista = List.of("A", "B", "C");

        // Cria um Stream a partir da lista (operação intermediária)
        Stream<String> stream = lista.stream();
    }

}
