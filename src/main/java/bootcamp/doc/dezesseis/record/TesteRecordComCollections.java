package bootcamp.doc.dezesseis.record;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Demonstra Records com Collections e Streams.
 * Records funcionam perfeitamente com:
 * - List, Set, Map
 * - Stream API (filter, map, sorted, collect)
 * - Comparator
 * - Collectors.groupingBy
 */
public class TesteRecordComCollections {

    public static void main(String[] args) {
        List<ContaRecord> contas = new ArrayList<>();

        contas.add(new ContaRecord("Conta Corrente", 1500.00, 0.50));
        contas.add(new ContaRecord("Conta Poupança", 3000.00, 0.25));
        contas.add(new ContaRecord("Conta Comum", 800.00, 0.10));
        contas.add(new ContaRecord("Conta Corrente", 4500.00, 0.50));
        contas.add(new ContaRecord("Conta Poupança", 12000.00, 0.25));

        // Filtrar contas com saldo > 2000
        System.out.println("=== Contas com saldo > 2000 ===");
        contas.stream()
                .filter(c -> c.saldo() > 2000)
                .forEach(System.out::println);

        // Ordenar por saldo (usando Comparator com method reference)
        System.out.println("\n=== Ordenadas por saldo ===");
        contas.stream()
                .sorted(Comparator.comparing(ContaRecord::saldo))
                .forEach(System.out::println);

        // Agrupar por tipo de conta
        System.out.println("\n=== Agrupadas por tipo ===");
        Map<String, List<ContaRecord>> porTipo = contas.stream()
                .collect(Collectors.groupingBy(ContaRecord::tipoConta));

        porTipo.forEach((tipo, lista) -> {
            System.out.println(tipo + ": " + lista.size() + " conta(s)");
            lista.forEach(c -> System.out.println("  " + c));
        });

        // Soma dos saldos por tipo
        System.out.println("\n=== Soma de saldos por tipo ===");
        Map<String, Double> somaPorTipo = contas.stream()
                .collect(Collectors.groupingBy(
                        ContaRecord::tipoConta,
                        Collectors.summingDouble(ContaRecord::saldo)
                ));

        somaPorTipo.forEach((tipo, soma) ->
                System.out.println(tipo + ": R$ " + soma));
    }

}
