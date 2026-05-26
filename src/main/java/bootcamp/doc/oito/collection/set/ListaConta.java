package bootcamp.doc.oito.collection.set;

import java.util.HashSet;
import java.util.Set;

/**
 * Demonstra HashSet (Set):
 * - NÃO permite elementos duplicados (usa equals/hashCode)
 * - NÃO garante ordem de inserção
 * - Ideal para garantir unicidade de elementos
 * NOTA: "Conta Comum" aparece 2x mas com saldos diferentes.
 * O Set usará equals() para decidir se são duplicatas.
 */
public class ListaConta {

    public static void main(String[] args) {
        Set<Conta> contas = new HashSet<>();

        contas.add(new Conta("Conta Corrente", 100.00));
        contas.add(new Conta("Conta Poupança", 200.00));
        contas.add(new Conta("Conta Comum", 300.00));
        contas.add(new Conta("Conta Comum", 400.00)); // Pode ou não ser adicionada (depende de hashCode)

        System.out.println(contas);
    }

}
