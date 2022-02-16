package mull;

import java.util.Scanner;

public class EVA {

    public static void main(String[] args) {

        // E
        short eingabeSekunden; // lokale Variable - Deklaration einer Variable
        eingabeSekunden = gibSekundenEin(); // Initialisierung der Variable mit dem Rückgabewert des Methodenaufrufs

        // V
        String text; // lokale Variable - Deklaration einer Variable
        text = verarbeiteUhrzeit(eingabeSekunden); // Initialisierung der Variable mit dem Rückgabewert des Methodenaufrufs

        // A
        gibUhrzeitAus(text);
    }

    public static short gibSekundenEin() { // Anfang lokal
        System.out.println("E");

        // Eingabe
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie Sekunden ein!");

        String eingabeText = scanner.next();
        System.out.println("Die Text-Eingabe war: " + eingabeText);

        // Lokale Variable in einer Methode
        short eingabeSekunden = Short.parseShort(eingabeText);
        System.out.println("Die int Eingabe war: " + eingabeSekunden);

        return eingabeSekunden;
        // Ende lokal
    }

    public static String verarbeiteUhrzeit(short eingabeSekunden) {
        System.out.println("V");

        // short eingabeSekunden ; // lokale Variable
        System.out.println(eingabeSekunden);

        short stunden = (short) (eingabeSekunden / 3600); // casting, bewusstes umwandeln von einem grösseren Datentyp
        // in einen kleineren.

        short minuten = (short) ((eingabeSekunden % 3600) / 60);
        short sekunden = (short) ((eingabeSekunden % 3600) % 60);

        String text = stunden + ":" + minuten + ":" + sekunden;

        return text; // kann nur einen Wert Rücktransportiereten
    }

    public static void gibUhrzeitAus(String text) {
        System.out.println("A");
        // Ausgabe (A)
        System.out.println("Ausgabe:" + text);



    }

}