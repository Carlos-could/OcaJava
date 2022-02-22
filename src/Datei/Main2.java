package Datei;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        ArrayList<String> liste1;
        liste1 = datenDateiEinlesenUndAnzeigen("src/DateiDatei/daten1.txt");
        datenDateiAnzeigen(liste1);


        ArrayList<String> liste2;
        liste2 = datenDateiEinlesenUndAnzeigen("src/DateiDatei/daten2.txt");
        datenDateiAnzeigen(liste2);
    }

//ESTE METODE LEE
    public static ArrayList<String> datenDateiEinlesenUndAnzeigen (String dateiname) {

        ArrayList<String> liste = new ArrayList<>();
        File f = new File(dateiname);
        String zeile = "";

        try {
            Scanner scanner = new Scanner(f);

            for (int i = 0; i < Integer.MAX_VALUE; i++) {
                try {
                    zeile = scanner.nextLine();
                    // System.out.println(zeile);
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
        return liste;
    }
// ESTE METODE IMPRIME
    public static void datenDateiAnzeigen (ArrayList<String> liste){
//         Alle Zeilen anzeigen
//        System.out.println("Alle eingelesenen Zeilen ausgeben:");

        for (String z : liste) {
            System.out.println(z);
        }
//        System.out.println("Jetzt sind alle Daten da! in Liste");


    }

}