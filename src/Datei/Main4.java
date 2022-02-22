package Datei;

import com.sun.javafx.image.BytePixelSetter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main4 {

    /**
     * @param args
     */
    public static void main(String[] args) {

        DatenDatei datei1 = new DatenDatei("src/Datei/daten1.txt");
        datei1.datenDateiAnzeigen(1,1);


        DatenDatei datei2 = new DatenDatei("src/Datei/daten2.txt");
        datei2.datenDateiAnzeigen(0,1);

        System.out.println( DatenDatei.konvertierStringZuInt("100") );

//        ArrayList<String> liste1= datei1.getListe();
//        liste1.add("hallo"); // versuchen die interne Liste der Klasse zu verändern!

        // klappte nicht, das Geheimnis liegt im Getter für die liste! siehe unten!
//        datei1.datenDateiAnzeigen();



    }
}

class DatenDatei{
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
    /**
     * @return the dateiname
     */
    public String getDateiname() {
        return dateiname;
    }

    /**
     * @param dateiname the dateiname to set
     */
	/*
	 * Der Setter für den Dateinamen macht keinen Sinn ohne die Liste neu zu laden,
	 * was aber nicht über den Namen der Methode verständlich wäre
	 *
	public void setDateiname(String dateiname) {
		this.dateiname = dateiname;
	}*/

    /**
     * @return the liste
     */
    public ArrayList<String> getListe() {
        // eine Kopie der Liste zurückgeben, sonst kann diese auf Grund des Referenzprinzipes ausserhalb des
        // Geltungsbereichs der Klasse(Scope) geändert werden!

        ArrayList<String> kopierteListe = new ArrayList<>(liste);

        return kopierteListe;
    }

    /**
     * @param liste the liste to set
     */
	/* Der Setter für die Liste macht keinen Sinn, mann könnte meinen die Daten würden in die DAtei zurückgeschrieben,
	 * was aber nicht der Fall ist!
	 * public void setListe(ArrayList<String> liste) {
		this.liste = liste;
	}
	*/

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
