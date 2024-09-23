package collection.iterator;

import collection.map.Conta;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TesteIterator {

    public static void main(String[] args) {
        List<Conta> contas = new ArrayList<>();

        contas.add(new Conta("Conta Corrente", 100.00));
        contas.add(new Conta("Conta Poupança", 200.00));
        contas.add(new Conta("Conta Comum", 300.00));
        contas.add(new Conta("Conta Comum", 400.00));

        Conta conta;
        Iterator<Conta> iteratorConta = contas.iterator();

        while(iteratorConta.hasNext()) {
            conta = iteratorConta.next();
            System.out.println(conta);
        }
    }

}
