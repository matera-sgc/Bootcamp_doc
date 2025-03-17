package bootcamp.doc.oito.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TesteMapComparador {

    public static void main(String[] args) {
        Map<Integer, String> mapaContas = new HashMap<>();

        mapaContas.put(1, "Conta Corrente");
        mapaContas.put(2, "Conta Poupança");
        mapaContas.put(3, "Conta Comum");

        ComparadorIntsMap comparadorIntsMap = new ComparadorIntsMap(mapaContas);

        Map<Integer, String> mapaContasOrdenadas = new TreeMap<>(comparadorIntsMap);
        mapaContasOrdenadas.putAll(mapaContas);

        mapaContasOrdenadas.keySet().forEach(indice -> System.out.println(indice + " - " + mapaContas.get(indice)));
    }

}
