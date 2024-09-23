package stream;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TesteStreamFilter {

    public static void main(String[] args) throws IOException {
        List<String> tiposConta = new ArrayList<>();

        tiposConta.add("Conta Corrente");
        tiposConta.add("Conta Poupança");
        tiposConta.add("Conta Comum");

        tiposConta.stream()
                .filter(conta -> conta.equals("Conta Comum"))
                .forEach(conta -> System.out.println(conta));
    }

}
