package fechas;
import javafx.beans.binding.Bindings;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


public class fechas {
    public static void main(String[] args) {
        //Aufgabe A
        LocalDate ld = LocalDate.now(); //inmutable
        System.out.println(ld);
//Aufgabe B
        LocalDate lx = LocalDate.of(2000,1,1);
        System.out.println(lx);
//Aufgabe C
        String str = "11-02-2022 10:33:01";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        LocalDateTime dateTime = LocalDateTime.parse(str, formatter);

        LocalDateTime dateTime2 = LocalDateTime.parse("11-02-2022 10:33:01", formatter);

        System.out.println(dateTime);
        System.out.println(dateTime2);
        //Aufgabe D

        String horaUsa = "11 Februar 2022 7:49";
        DateTimeFormatter USA = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm a");
        LocalDateTime dateTimeUsa = LocalDateTime.parse(horaUsa, formatter);

    }
}
