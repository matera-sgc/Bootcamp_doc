package bootcamp.doc.nove.stream;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TesteStreamForEach {

    public static void main(String[] args) throws IOException {
        List<String> tiposConta = new ArrayList<>();

        tiposConta.add("Conta Corrente");
        tiposConta.add("Conta Poupança");

        tiposConta.stream().forEach(conta -> System.out.println(conta));
    }

}
