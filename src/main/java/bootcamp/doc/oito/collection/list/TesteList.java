package bootcamp.doc.oito.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Demonstra ArrayList (List):
 * - Permite elementos duplicados
 * - Mantém ordem de inserção
 * - Collections.sort(): ordena a lista em ordem alfabética/natural
 */
public class TesteList {

    public static void main(String[] args) {
        List<String> contas = new ArrayList<>();

        contas.add("Conta Corrente");
        contas.add("Conta Corrente"); // Duplicata permitida em List
        contas.add("Conta Poupança");
        contas.add("Conta Comum");

        System.out.println(contas); // Ordem de inserção

        Collections.sort(contas); // Ordena alfabeticamente

        System.out.println(contas); // Ordem alfabética
    }

}
