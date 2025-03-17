package bootcamp.doc.cinco.localdate;

import java.time.Duration;
import java.time.Instant;

public class ExemploInstant {

    public static void main(String[] args) {
        Instant tempoInicial = Instant.now();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Instant tempoFinal = Instant.now();

        Duration duracao = Duration.between(tempoInicial, tempoFinal);

        System.out.println("Duracao em nanos: " + duracao.toNanos());
        System.out.println("Duracao em segundos: " + duracao.toSeconds());
        System.out.println("Duracao em minutos: " + duracao.toMinutes());
        System.out.println("Duracao em horas: "  + duracao.toHours());
        System.out.println("Duracao em milisegundos: " + duracao.toMillis());
        System.out.println("Duracao em dias: " + duracao.toDays());
    }

}
