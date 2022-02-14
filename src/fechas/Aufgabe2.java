package fechas;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import static java.text.DateFormat.SHORT;

public class Aufgabe2 {
    public static void main(String[] args) {


        LocalDateTime datum = LocalDateTime.of(2022, 02, 11, 10,44);
        //A - ISO format
        System.out.println(datum);
        //B
        int jahr = datum.getYear();
        Month monat = datum.getMonth();
        int tag = datum.getDayOfMonth();
        int stunde = datum.getHour();
        int minute = datum.getMinute();
        System.out.println("Heute ist der " +tag+"." +monat+ " " +jahr+", es ist " +stunde+ " Uhr " +minute);

        //C
        DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);

        System.out.println(shortDateTime.format(datum));	// 11.02.22

        DateTimeFormatter mediumDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        System.out.println(mediumDateTime.format(datum));	// 11.02.2022

        //D

        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd.MMMM yy");
        System.out.println(datum.format(f));

        DateTimeFormatter h = DateTimeFormatter.ofPattern("hh");
        DateTimeFormatter m = DateTimeFormatter.ofPattern("m");
        System.out.println(datum.format(h) + " Uhr " + datum.format(m) + " Minuten ");

        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("dd.MMMM yyyy");
        System.out.println("Heute ist der " +datum.format(f2)+ ", es ist " +datum.format(h) + " Uhr " + datum.format(m) + " Minuten.");




    }
}
