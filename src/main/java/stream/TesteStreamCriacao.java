package stream;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TesteStreamCriacao {

    public static void main(String[] args) throws IOException {
        Stream<String> linhas = Files.lines(Paths.get("teste.txt"), Charset.defaultCharset());
        Stream<Integer> numeros = Stream.of(1, 2, 3, 4, 5);
        IntStream numerosArray = Arrays.stream(new int[] {1, 2, 3});
    }

}
