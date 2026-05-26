package bootcamp.doc.oito.collection.list;

import bootcamp.doc.oito.collection.set.Conta;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Demonstra ordenação de objetos com Comparator customizado.
 * Collections.sort(lista, comparador) usa o comparador fornecido
 * para definir a lógica de ordenação entre objetos.
 */
public class TesteListComComparador {

    public static void main(String[] args) {
        List<Conta> contas = new ArrayList<>();
        ComparaConta comparadorContas = new ComparaConta();

        contas.add(new Conta("Conta Corrente", 100.00));
        contas.add(new Conta("Conta Poupança", 200.00));
        contas.add(new Conta("Conta Comum", 300.00));
        contas.add(new Conta("Conta Comum", 400.00));

        System.out.println("Antes da Ordenação:");
        contas.forEach(conta -> System.out.println(conta.getTipoConta()));

        // Ordena usando o comparador customizado
        Collections.sort(contas, comparadorContas);

        System.out.println();
        System.out.println("Depois da Ordenação:");
        contas.forEach(conta -> System.out.println(conta.getTipoConta()));

    }

}
