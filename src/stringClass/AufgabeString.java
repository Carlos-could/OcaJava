package stringClass;

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

//        //Aufgabe H
//        String nullBisNeun = "0123456789";
//        char ziffer;
//        String kartenummer = "";
//
//        for (int i=1; i<20; ++i){
//            ziffer = nullBisNeun.charAt((int) (Math.random()*10));
//            String zifferen = String.valueOf((char)(ziffer));
//            if (i%5==0){
//                kartenummer +="-";
//                i++;
//            }
//            kartenummer = kartenummer.concat(zifferen);
//        }
//        System.out.println(kartenummer);

        //Aufgabe H
       String[] nummer = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };
       int position;
       String karteVisa = "";

       for (int i=1; i<=16; ++i){
           position = (int) (Math.random()*10);
           karteVisa += nummer[position];
           if (i==4 | i==8 | i==12)
               karteVisa +="-";
       }
       System.out.print(karteVisa);
        System.out.println("");

        //Aufgabe I
        String maske = "";
        for (int i=1; i<17; i++){
            maske += "X";
            if (i==4 | i==8 | i==12)
                maske +="-";
        }
        System.out.println(maske);

        String submaske = maske.substring(0,15);
//        System.out.println(submaske);
        String subKarteVisa = karteVisa.substring(15,19);
//        System.out.println(subKarteVisa);
        String maskierteKarte = submaske.concat(subKarteVisa);
        System.out.println(maskierteKarte);

        //Aufgabe J
        String mastercard = "5555-6548-6167-9494";
        int ergebnis = mastercard.indexOf("5555");
        if (ergebnis ==0)
            System.out.println("ungültige Startkennung!");
        else
            System.out.println("gültige Startkennung");


        //Aufgabe K
        System.out.println( karteVisa.startsWith("0") );
        System.out.println( karteVisa.endsWith("0") );

        //L
        String visa = "8061-2585-4711-8980";
        boolean contain = visa.contains("4711");
        System.out.println(contain?"ja":"nein");

    }
}
