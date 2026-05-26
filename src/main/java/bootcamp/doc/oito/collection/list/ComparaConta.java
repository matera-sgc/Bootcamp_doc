package bootcamp.doc.oito.collection.list;

import bootcamp.doc.oito.collection.set.Conta;

import java.util.Comparator;

/**
 * Implementa Comparator<Conta> para definir critério de ordenação.
 * Compara contas pelo nome do tipoConta (ordem alfabética).
 * Usado com Collections.sort(lista, comparador).
 */
public class ComparaConta implements Comparator<Conta> {

    @Override
    public int compare(Conta conta1, Conta conta2) {
        // compareTo retorna: negativo (menor), 0 (igual), positivo (maior)
        return conta1.getTipoConta().compareTo(conta2.getTipoConta());
    }
}
