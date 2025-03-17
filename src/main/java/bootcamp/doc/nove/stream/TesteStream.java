package bootcamp.doc.nove.stream;

import java.util.List;
import java.util.stream.Stream;

public class TesteStream {

    public static void main(String[] args) {
        List<String> lista = List.of("A", "B", "C");

        Stream<String> stream = lista.stream();
    }

}
