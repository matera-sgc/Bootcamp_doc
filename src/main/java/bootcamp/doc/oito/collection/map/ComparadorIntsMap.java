package bootcamp.doc.oito.collection.map;

import java.util.Comparator;
import java.util.Map;

/**
 * Comparator customizado que ordena chaves Integer
 * baseado nos VALORES (String) do mapa.
 * Usado com TreeMap para criar um mapa ordenado por valor.
 */
public class ComparadorIntsMap implements Comparator<Integer> {

    Map<Integer, String> base; // Referência ao mapa original

    public ComparadorIntsMap(Map<Integer, String> base) {
        this.base = base;
    }

    @Override
    public int compare(Integer integer1, Integer integer2) {
        // Compara os valores (String) associados às chaves
        return base.get(integer1).compareTo(base.get(integer2));
    }
}
