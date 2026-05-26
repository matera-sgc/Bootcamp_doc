package bootcamp.doc.cinco.localdate;

import java.time.Duration;
import java.time.Instant;

/**
 * Demonstra Instant e Duration para medir tempo de execução.
 * - Instant.now(): captura um ponto no tempo (timestamp)
 * - Duration.between(): calcula a diferença entre dois instantes
 * - Conversões: toNanos(), toSeconds(), toMinutes(), toHours(), toMillis(), toDays()
 */
public class ExemploInstant {

    public static void main(String[] args) {
        Instant tempoInicial = Instant.now(); // Marca início

        try {
            Thread.sleep(1000); // Simula processamento de 1 segundo
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Instant tempoFinal = Instant.now(); // Marca fim

        Duration duracao = Duration.between(tempoInicial, tempoFinal);

        System.out.println("Duracao em nanos: " + duracao.toNanos());
        System.out.println("Duracao em segundos: " + duracao.toSeconds());
        System.out.println("Duracao em minutos: " + duracao.toMinutes());
        System.out.println("Duracao em horas: "  + duracao.toHours());
        System.out.println("Duracao em milisegundos: " + duracao.toMillis());
        System.out.println("Duracao em dias: " + duracao.toDays());
    }

}
