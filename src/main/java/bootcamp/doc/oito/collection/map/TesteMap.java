package bootcamp.doc.oito.collection.map;

import java.util.HashMap;
import java.util.Map;

/**
 * Demonstra HashMap (Map):
 * - Estrutura chave-valor (key-value)
 * - put(key, value): insere par
 * - get(key): recupera valor pela chave
 * - Chaves são únicas; valores podem se repetir
 */
public class TesteMap {

    public static void main(String[] args) {
        Map<Integer, String> mapaContas = new HashMap<>();

        mapaContas.put(1, "Conta Corrente");
        mapaContas.put(2, "Conta Poupança");
        mapaContas.put(3, "Conta Comum");

        System.out.println(mapaContas); // Imprime todo o mapa

        System.out.println(mapaContas.get(2)); // Busca por chave
    }

}
