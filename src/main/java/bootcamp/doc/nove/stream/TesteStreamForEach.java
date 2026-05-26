package bootcamp.doc.nove.stream;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Demonstra forEach() como operação terminal de Stream.
 * - forEach(): executa uma ação para cada elemento do stream
 * - É uma operação terminal (encerra o stream)
 * - Equivalente funcional ao for-each tradicional
 */
public class TesteStreamForEach {

    public static void main(String[] args) throws IOException {
        List<String> tiposConta = new ArrayList<>();

        tiposConta.add("Conta Corrente");
        tiposConta.add("Conta Poupança");

        // stream().forEach() = itera sobre cada elemento com lambda
        tiposConta.stream().forEach(conta -> System.out.println(conta));
    }

}
