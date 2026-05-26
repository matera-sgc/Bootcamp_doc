package bootcamp.doc.cinco.localdate;

import java.time.LocalDateTime;

/**
 * Demonstra LocalDateTime para obter data e hora atuais.
 * - getDayOfWeek(): dia da semana (MONDAY, TUESDAY...)
 * - getMonthValue(): mês numérico (1-12)
 * - getMonth(): mês por nome (JANUARY, FEBRUARY...)
 * - getYear(), getHour(), getMinute(), getSecond(): componentes individuais
 */
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
