package bootcamp.doc.oito.collection.map;

import java.util.HashMap;
import java.util.Map;

/**
 * Demonstra Map com objetos como valor.
 * - keySet(): retorna todas as chaves do mapa
 * - forEach com lambda para iterar sobre as chaves
 * - Usa toString() do objeto Conta para impressão
 */
public class TesteMapTable {

    public static void main(String[] args) {
        Map<Integer, Conta> mapaContas = new HashMap<>();

        mapaContas.put(1, new Conta("Conta Corrente", 100.00));
        mapaContas.put(2, new Conta("Conta Poupança", 200.00));
        mapaContas.put(3, new Conta("Conta Comum", 300.00));
        mapaContas.put(4, new Conta("Conta Comum", 400.00));

        // Itera sobre as chaves e imprime cada conta
        mapaContas.keySet().forEach(indice -> System.out.println(mapaContas.get(indice)));
    }

}
