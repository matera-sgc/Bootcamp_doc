package bootcamp.doc.oito.collection.set;

import java.util.HashSet;
import java.util.Set;

public class ListaConta {

    public static void main(String[] args) {
        Set<Conta> contas = new HashSet<>();

        contas.add(new Conta("Conta Corrente", 100.00));
        contas.add(new Conta("Conta Poupança", 200.00));
        contas.add(new Conta("Conta Comum", 300.00));
        contas.add(new Conta("Conta Comum", 400.00));

        System.out.println(contas);
    }

}
