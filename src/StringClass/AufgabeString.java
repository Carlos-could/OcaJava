package StringClass;

import java.util.Scanner;

public class AufgabeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        //Aufgabe A
//        System.out.print("Geben Sie Vorname: ");
//        String vorname = sc.next();
//        System.out.print("Geben Sie Nachname: ");
//        String nachname = sc.next();
//
//        vorname = vorname.toUpperCase().trim();
//        nachname = nachname.toUpperCase().trim();
//
//        System.out.println(vorname);
//        System.out.println(nachname);
//
//        //Aufgabe B
//        vorname = vorname.trim().toLowerCase();
//        nachname = nachname.trim().toLowerCase();
//
//        System.out.println(vorname);
//        System.out.println(nachname);
//
//        //Aufgabe C
//        String VorUndNachname = vorname+nachname;
//        System.out.println(VorUndNachname.length());
//
//        //Aufgabe D
//        vorname = vorname.replace("ä","ae")
//                .replace("Ä", "Ae")
//                .replace("ö", "oe")
//                .replace("Ö", "Oe")
//                .replace("ü", "ue")
//                .replace("Ü", "Ue")
//                .replace("ß", "ss");
//
//        nachname = nachname.replace("ä","ae")
//                .replace("Ä", "Ae")
//                .replace("ö", "oe")
//                .replace("Ö", "Oe")
//                .replace("ü", "ue")
//                .replace("Ü", "Ue")
//                .replace("ß", "ss");
//
//        //Aufgabe E
//        VorUndNachname = vorname+nachname;
//        System.out.println(VorUndNachname.length());
//
//        //Aufgabe F
//        System.out.print(vorname.charAt(0));
//        System.out.print(nachname.charAt(0));
//        System.out.println("");
//
//        //Aufgabe G
//        String anderename = "Muster";
//        System.out.println(vorname.equalsIgnoreCase(anderename));
//        System.out.println(nachname.equalsIgnoreCase(anderename));

        //Aufgabe H

        String nullBisNeun = "0123456789";
        char ziffer;
        ziffer = nullBisNeun.charAt( (int) (Math.random()*10+1) );
        String zifferen = String.valueOf((char)(ziffer));
        String kartenummer = "";
        kartenummer = kartenummer.concat(zifferen);

        ziffer = nullBisNeun.charAt( (int) (Math.random()*10+1) );
        zifferen = String.valueOf((char)(ziffer));
        kartenummer = kartenummer.concat(zifferen);
        System.out.println(kartenummer);

    }

}
