package If;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
//      Eingabe
        byte eingabe = eingabe();

//        Vorarbeitung
        String vorarbeitung = vorarbeitung(eingabe);

//        Ausgabe
        ausgabe(vorarbeitung);
    }

    private static byte eingabe() {
        Scanner input = new Scanner (System.in);
        System.out.println("Geben Sie eine Nummer: ");
        byte x = input.nextByte();
        return x;
    }
    private static String vorarbeitung( byte eingabe) {
        switch (eingabe){
            case 1:
                String zuruck;
                zuruck = "Der Monat ist Januar \nThe month is January.";
                return zuruck;
            case 2:
                zuruck = "Der Monat ist Februar \nThe month is February.";
                return zuruck;
            case 3:
                zuruck = "Der Monat ist März \nThe month is March.";
                return zuruck;
            case 4:
                zuruck = "Der Monat ist April \nThe month is April.";
                return zuruck;
            case 5:
                zuruck = "Der Monat ist Mai \nThe month is May.";
                return zuruck;
            case 6:
                zuruck = "Der Monat ist Juni \nThe month is June.";
                return zuruck;
            case 7:
                zuruck = "Der Monat ist Juli \nThe month is July.";
                return zuruck;
            case 8:
                zuruck = "Der Monat ist August \nThe month is August.";
                return zuruck;
            case 9:
                zuruck = "Der Monat ist September \nThe month is September.";
                return zuruck;
            case 10:
                zuruck = "Der Monat ist Oktober \nThe month is October.";
                return zuruck;
            case 11:
                zuruck = "Der Monat ist November \nThe month is November.";
                return zuruck;
            case 12:
                zuruck = "Der Monat ist Dezember \nThe month is December.";
                return zuruck;

            default:
                zuruck = "Kein Monat \nnot month";
                return zuruck;
        }
    }
    private static void ausgabe(String ausdruck){
        System.out.println(ausdruck);
    }
}


