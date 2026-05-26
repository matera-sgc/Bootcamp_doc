package bootcamp.doc.oito.collection.iterator;

import bootcamp.doc.oito.collection.map.Conta;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Demonstra o padrão Iterator para percorrer coleções.
 * - iterator(): retorna um Iterator para a coleção
 * - hasNext(): verifica se há próximo elemento
 * - next(): retorna o próximo elemento
 * Iterator permite remover elementos durante a iteração (ao contrário do for-each).
 */
public class TesteIterator {

    public static void main(String[] args) {
        List<Conta> contas = new ArrayList<>();

        contas.add(new Conta("Conta Corrente", 100.00));
        contas.add(new Conta("Conta Poupança", 200.00));
        contas.add(new Conta("Conta Comum", 300.00));
        contas.add(new Conta("Conta Comum", 400.00));

        Conta conta;
        Iterator<Conta> iteratorConta = contas.iterator();

        // Percorre a lista usando Iterator
        while(iteratorConta.hasNext()) {
            conta = iteratorConta.next();
            System.out.println(conta);
        }
    }

}
