package collection.list;

import collection.set.Conta;

import java.util.Comparator;

public class ComparaConta implements Comparator<Conta> {

    @Override
    public int compare(Conta conta1, Conta conta2) {
        return conta1.getTipoConta().compareTo(conta2.getTipoConta());
    }
}
