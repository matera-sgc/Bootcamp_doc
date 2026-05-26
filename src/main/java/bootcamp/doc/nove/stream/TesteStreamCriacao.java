package bootcamp.doc.nove.stream;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Demonstra diferentes formas de criar Streams:
 * 1. Files.lines(): stream de linhas de um arquivo
 * 2. Stream.of(): stream a partir de valores explícitos
 * 3. Arrays.stream(): stream a partir de um array
 */
public class TesteStreamCriacao {

    public static void main(String[] args) throws IOException {
        // Stream de linhas de arquivo texto
        Stream<String> linhas = Files.lines(Paths.get("teste.txt"), Charset.defaultCharset());
        // Stream de valores explícitos
        Stream<Integer> numeros = Stream.of(1, 2, 3, 4, 5);
        // IntStream a partir de array primitivo
        IntStream numerosArray = Arrays.stream(new int[] {1, 2, 3});
    }

}
