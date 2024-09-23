package localdate;

import java.time.LocalDateTime;

public class ExemploLocalDateTime {

    public static void main(String[] args) {
        LocalDateTime data = LocalDateTime.now();
        System.out.println("Dia da semana: " + data.getDayOfWeek().name());
        System.out.println("Dia da semana: " + data.getDayOfWeek().ordinal());
        System.out.println("Mes: " + data.getMonthValue());
        System.out.println("Mes: " + data.getMonth().name());
        System.out.println("Ano: " + data.getYear());
        System.out.println("Hora: " + data.getHour());
        System.out.println("Minutos: " + data.getMinute());
        System.out.println("Segundos: " + data.getSecond());
    }

}
