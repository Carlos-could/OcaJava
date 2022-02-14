package fechas;
import javafx.beans.binding.Bindings;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


public class fechas {
    public static void main(String[] args) {
//        //Aufgabe A
//        LocalDate ld = LocalDate.now(); //inmutable
//        System.out.println(ld);
//
//        //Aufgabe B
//        LocalDate lx = LocalDate.of(2000,1,1);
//        System.out.println(lx);
//
//        //Aufgabe C
//        String str = "11-02-2022 10:33:01";
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
//        LocalDateTime dateTime1 = LocalDateTime.parse(str, formatter);
//        LocalDateTime dateTime2 = LocalDateTime.parse("11/02/2022 10:33:01", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
//
//        System.out.println(dateTime1);
//        System.out.println(dateTime2);

        //Aufgabe D


        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy h:mm a");
        String strUSA = "11/02/2022 7:49 AM";

        LocalDateTime dateTimeUsa = LocalDateTime.parse(strUSA, formateador);
        System.out.println(dateTimeUsa);//iso format

        DateTimeFormatter formateador2 = DateTimeFormatter.ofPattern("dd/MM/yyyy h:mm a");
        String strUSA2 = "11/02/2022 1:49 PM";
        LocalDateTime fechaLocal = LocalDateTime.parse(strUSA2,formateador2);
        System.out.println(formateador2.format(fechaLocal));




    }
}
