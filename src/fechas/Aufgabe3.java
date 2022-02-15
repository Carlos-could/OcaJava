package fechas;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.Period;

public class Aufgabe3 {
    public static void main(String[] args) {
        //A
        LocalDate datumHeute = LocalDate.now();
        LocalDate Geburstag = LocalDate.of(2022,02,06);

        System.out.println(datumHeute);
        System.out.println(Geburstag);

        //B

        System.out.println(datumHeute.isBefore(Geburstag)? "Ich habe dieses Jahr noch Geburtstag":"Ich hatte dieses Jahr bereits Geburtstag");
        System.out.println(Geburstag.isAfter(datumHeute)? "Ich habe dieses Jahr noch Geburtstag":"Ich hatte dieses Jahr bereits Geburtstag");

        //C
        System.out.println("In 317 Tagen ist der " + datumHeute.plusDays(317));

        //D
        Period dife = Period.between(datumHeute,Geburstag );
        System.out.println("Mein Geburtstag in diesem Jahr war vor " +(dife.getMonths()*30+dife.getDays())+ " Tagen!");

    }
}
