package Datei;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        leseDateiEinUndZeigeSieAn("src/DateiDatei/daten1.txt");
        leseDateiEinUndZeigeSieAn("src/DateiDatei/daten2.txt");
    }

    public static void leseDateiEinUndZeigeSieAn (String dateiname){

        ArrayList<String> liste = new ArrayList<>();
        File f = new File(dateiname);
        String zeile = "";


        try {
            Scanner scanner = new Scanner(f);

            for (int i = 0; i < Integer.MAX_VALUE; i++) {
                try {
                    zeile = scanner.nextLine();
                    System.out.println(zeile + "----");
                    liste.add(zeile);
                } catch (NoSuchElementException e) {
                    // Ende der Schleife
                    break;
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Catch");
            System.out.println(e.getMessage());

        }
        // Alle Zeilen anzeigen
        System.out.println("Alle eingelesenen Zeilen ausgeben:");
        for (String z : liste) {
            System.out.println(z);
        }
        System.out.println("Jetzt sind alle Daten da! in Liste");


    }

}