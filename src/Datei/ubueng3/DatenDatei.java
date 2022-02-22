//package DateiDatei.DatenDatei;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.util.ArrayList;
//import java.util.NoSuchElementException;
//import java.util.Scanner;
//
//public class DatenDatei {
//
//    private ArrayList<String> liste;
//    private String dateiname;
//
//    public DatenDatei(String dateiname) {
//        this.dateiname = dateiname;
//        this.liste = datenDateiEinlesenUndAnzeigen(dateiname);
//        datenDateiAnzeigen (liste);
//    }
//
////    public ArrayList<String> getListe() {
////        return this.liste;
////    }
//
//    public void setListe(ArrayList<String> liste) {
//        this.liste = liste;
//    }
//
////    public String getDateiname() {
////        return dateiname;
////    }
//
//    public void setDateiname(String dateiname) {
//        this.dateiname = dateiname;
////        datenDateiEinlesenUndAnzeigen(this.dateiname);
//        this.liste = datenDateiEinlesenUndAnzeigen(dateiname);
//
//    }
//
//    public static ArrayList<String> datenDateiEinlesenUndAnzeigen (String dateiname) {
//
//        ArrayList<String> liste = new ArrayList<>();
//        File f = new File(dateiname);
//
//        String zeile = "";
//
//        try {
//            Scanner scanner = new Scanner(f);
//
//            for (int i = 0; i < Integer.MAX_VALUE; i++) {
//                try {
//                    zeile = scanner.nextLine();
//                    // System.out.println(zeile);
//                    liste.add(zeile);
//                } catch (NoSuchElementException e) {
//                    // Ende der Schleife
//                    break;
//                }
//            }
//
//        } catch (FileNotFoundException e) {
//            System.out.println("Catch");
//            System.out.println(e.getMessage());
//        }
//        return liste;
//    }
//    //Die Code zeigt an
//    public static void datenDateiAnzeigen (ArrayList<String> liste) {
////         Alle Zeilen anzeigen
////        System.out.println("Alle eingelesenen Zeilen ausgeben:");
//
//        for (String z : liste) {
//            System.out.println(z);
//        }
//
//    }
//
//
//
//}
