package bootcamp.doc.cinco.localdate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * Demonstra formatação de datas com DateTimeFormatter.
 * - ofPattern(): define o formato desejado (dd/MMMM/yyyy, dd-MMMM-yyyy)
 * - Locale: define o idioma para nomes de meses (ex: Alemanha)
 * - LocalDate.now(): obtém a data atual do sistema
 */
public class ExemploFormatarData {

    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        Locale local = Locale.GERMANY; // Define locale para alemão
        DateTimeFormatter formatadorComBarra = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        DateTimeFormatter formatadorComTraco = DateTimeFormatter.ofPattern("dd-MMMM-yyyy", local);

        System.out.println("Data com barra: " + hoje.format(formatadorComBarra));
        System.out.println("Data com traco: " + hoje.format(formatadorComTraco));
    }

}
