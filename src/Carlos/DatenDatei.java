package carlos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class DatenDatei{


    // Fields
    private String dateiname;
    private ArrayList<String> liste;


    // Methods

    // Konstrukto(ren)
    public DatenDatei(String dateiname) {
        this.dateiname = dateiname;
        this.liste = new ArrayList<>();

        this.datenDateiEinlesen();
        this.datenDateiAnzeigen();
    }

    // Getter / Setter
    public String getDateiname() {
        return dateiname;
    }


    public ArrayList<String> getListe() {
        // eine Kopie der Liste zurückgeben, sonst kann diese auf Grund des Referenzprinzipes ausserhalb des
        // Geltungsbereichs der Klasse(Scope) geändert werden!

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
    }

    public void datenDateiAnzeigen(int zeileNummer) {
        System.out.println(liste.get(zeileNummer));
    }

    public void datenDateiAnzeigen(int zeileNummer, int spalteNummer) {
//
//        System.out.println(liste.get(zeileNummer).split(";")[spalteNummer] );


        if ( liste.get(zeileNummer).contains(",") ) {

            System.out.println(liste.get(zeileNummer).split(",")[spalteNummer]);

        } else if ( liste.get(zeileNummer).contains(";")  ) {

            System.out.println(liste.get(zeileNummer).split(";")[spalteNummer]);
//            String[] x = (liste.get(zeileNummer).split(";") ) ;
//            for ( String xx: x){
//                System.out.print(xx + " ");
//            }
        }
    } //ende metode (x, x)

    public static int konvertierStringZuInt (String wert){
        return Integer.parseInt(wert);
    }


}
