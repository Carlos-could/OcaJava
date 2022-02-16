package stringBuilder;

import java.util.Scanner;

public class AufgabeStringBuilder2 {

    public static void main(String[] args) {
        StringBuilder idNummer = eingabe ();
        pruefeID(idNummer);
    }

    public static void pruefeID(StringBuilder idNummer) {

        StringBuilder id = new StringBuilder(idNummer.substring(0, 2));
        StringBuilder nurNummer = new StringBuilder(idNummer.substring(2, 12));
        //Nur Nummer drüken
        int ziffer = 0;
        for (int i = 0; i < nurNummer.length(); ++i) {
            ziffer = (int) ((nurNummer.charAt(i) - 48));
            System.out.print(ziffer + "\t");
        }
        System.out.println();

        //Schrift 1
        ziffer = 0;
        for (int i = 0; i < nurNummer.length(); i += 2) {
            ziffer = (int) ((nurNummer.charAt(i) - 48) * 2);
            System.out.print(ziffer + "\t\t");
        }
        System.out.println();

        //Schrift 2
        ziffer = 0;
        int summeSchrift2 = 0;
        for (int i = 0; i < nurNummer.length(); i += 2) {
            ziffer = (int) ((nurNummer.charAt(i) - 48) * 2);
            System.out.print(ziffer > 9 ? (ziffer % 10) + 1 + "\t\t" : ziffer + "\t\t");
            summeSchrift2 += ziffer > 9 ? (ziffer % 10) + 1 : ziffer;
        }
        System.out.println("\t" + summeSchrift2);

        //Schrift 3
        ziffer = 0;
        int summeSchrift3 = 0;
        for (int i = 1; i < nurNummer.length()-1; i += 2) {
            ziffer = (int) ((nurNummer.charAt(i) - 48));
            System.out.print("\t" + ziffer + "\t");
            summeSchrift3 += ziffer;
        }
        System.out.println("\t\t\t" + summeSchrift3);

        //Schrift 4
        int summeSchrift4 = summeSchrift2+summeSchrift3;
        System.out.println("\t\t\t" + summeSchrift2 + " + " + summeSchrift3 + "\t\t\t\t\t\t\t" + summeSchrift4);

        //Schrift 5
        int rest = 10 - (summeSchrift4%10);
        int aufrunde = summeSchrift4+rest;
        System.out.println(summeSchrift4 + " auf nächstgrößere 10 Zahl aufrunden \t\t" + aufrunde);

        //Schrift 6
        int pz = (aufrunde-summeSchrift4);
        System.out.println("\t\t\t" + aufrunde + " - " + summeSchrift4 + "\t\t\t\t\t\t\t" + pz + "(PZ*)");

        //Prufung
        System.out.println( ((nurNummer.charAt(9)-48) == pz)? "Die Prüfung war erfolgreich" : "Die Prüfung war NICHT erfolgreich" );
    }

    public static StringBuilder eingabe () {
        Scanner sc = new Scanner(System.in);
        System.out.print("Geben Sie die Kartenummer: ");
        StringBuilder idNummer = new StringBuilder(sc.next());
        return idNummer;
    }
}
