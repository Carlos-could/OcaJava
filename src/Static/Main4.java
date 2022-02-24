package Static;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {

        DatenDatei datei1 = new DatenDatei("src/Datei/daten1.txt");
//        datei1.datenDateiAnzeigen(1,1);

        DatenDatei datei2 = new DatenDatei("src/Datei/daten2.txt");
//        datei2.datenDateiAnzeigen(0,1);

        System.out.println( DatenDatei.konvertierStringZuInt("100") );

    }
}

class DatenDatei{
    // Fields
    private String dateiname;
    private ArrayList<String> liste;
    private static int instanzZaehler;

    public static int getInstanzZaehler() {
        return instanzZaehler;
    }

    // Konstrukto(ren)
    public DatenDatei(String dateiname) {
        this.dateiname = dateiname;
        this.liste = new ArrayList<>();

        instanzZaehler++;
        this.datenDateiEinlesen();
        this.datenDateiAnzeigen();
    }

    // Getter / Setter
    public String getDateiname() {
        return dateiname;
    }

    public ArrayList<String> getListe() {
        ArrayList<String> kopierteListe = new ArrayList<>(liste);
        return kopierteListe;
    }

    // andere Methoden
    public void datenDateiEinlesen() {

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
    }

    public void datenDateiAnzeigen() {
        // Alle Zeilen anzeigen
        System.out.println("\nAlle eingelesenen Zeilen ausgeben:");
        for (String z : liste) {
            System.out.println(z);
        }
        System.out.println("Die Anzahl der Instanzen ist nun " +DatenDatei.getInstanzZaehler());
    }

    public void datenDateiAnzeigen(int zeileNummer) {
        System.out.println(liste.get(zeileNummer));
    }

    public void datenDateiAnzeigen(int zeileNummer, int spalteNummer) {


        if ( liste.get(zeileNummer).contains(",") ) {

            System.out.println(liste.get(zeileNummer).split(",")[spalteNummer]);

        } else if ( liste.get(zeileNummer).contains(";")  ) {

            System.out.println(liste.get(zeileNummer).split(";")[spalteNummer]);
        }
    } //ende metode (x, x)

    public static int konvertierStringZuInt (String wert){
        return Integer.parseInt(wert);
    }


}
