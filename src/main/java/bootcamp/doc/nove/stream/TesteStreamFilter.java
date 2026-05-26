package bootcamp.doc.nove.stream;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Demonstra filter() em Stream:
 * - filter(): operação intermediária que seleciona elementos pela condição
 * - Só passa adiante elementos onde a condição retorna true
 * - Combinado com forEach() para imprimir os resultados filtrados
 */
public class TesteStreamFilter {

    public static void main(String[] args) throws IOException {
        List<String> tiposConta = new ArrayList<>();

        tiposConta.add("Conta Corrente");
        tiposConta.add("Conta Poupança");
        tiposConta.add("Conta Comum");

        // Filtra apenas "Conta Comum" e imprime
        tiposConta.stream()
                .filter(conta -> conta.equals("Conta Comum"))
                .forEach(conta -> System.out.println(conta));
    }

}
