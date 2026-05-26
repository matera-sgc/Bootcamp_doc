package bootcamp.doc.dez.filter;

import java.util.HashMap;
import java.util.Map;

/**
 * Demonstra filter() aplicado a um Map usando Stream.
 * - entrySet(): retorna os pares chave-valor como Set<Entry>
 * - stream(): converte para stream
 * - filter(): filtra entries onde a chave é <= 2
 * - forEach(): imprime os resultados filtrados
 */
public class TesteFilter {

    public static void main(String[] args) {
        Map<Integer, String> contas = new HashMap<>();

        contas.put(1, "Conta Corrente");
        contas.put(2, "Conta Poupança");
        contas.put(3, "Conta Comum");

        // Filtra entries com chave <= 2 e imprime chave + valor
        contas.entrySet()
                .stream()
                .filter(map -> map.getKey() <= 2)
                .forEach(map -> System.out.println(map.getKey() + " - " + map.getValue()));
    }

}
