package collection.map;

import java.util.HashMap;
import java.util.Map;

public class TesteMap {

    public static void main(String[] args) {
        Map<Integer, String> mapaContas = new HashMap<>();

        mapaContas.put(1, "Conta Corrente");
        mapaContas.put(2, "Conta Poupança");
        mapaContas.put(3, "Conta Comum");

        System.out.println(mapaContas);

        System.out.println(mapaContas.get(2));
    }

}
