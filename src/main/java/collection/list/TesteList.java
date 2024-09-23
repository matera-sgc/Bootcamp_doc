package collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteList {

    public static void main(String[] args) {
        List<String> contas = new ArrayList<>();

        contas.add("Conta Corrente");
        contas.add("Conta Corrente");
        contas.add("Conta Poupança");
        contas.add("Conta Comum");

        System.out.println(contas);

        Collections.sort(contas);

        System.out.println(contas);
    }

}
