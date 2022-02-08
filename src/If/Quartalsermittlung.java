package If;

import java.util.Scanner;

public class Quartalsermittlung {
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
                zuruck = "Der Monat ist Januar. Dieser liegt im I. Quartal \nThe month is January. This is in the I quarter";
                return zuruck;
            case 2:
                zuruck = "Der Monat ist Februar. Dieser liegt im I. Quartal \nThe month is February. This is in the I quarter";
                return zuruck;
            case 3:
                zuruck = "Der Monat ist März. Dieser liegt im I. Quartal \nThe month is March. This is in the I quarter";
                return zuruck;
            case 4:
                zuruck = "Der Monat ist April. Dieser liegt im II. Quartal \nThe month is April.This is in the II quarter ";
                return zuruck;
            case 5:
                zuruck = "Der Monat ist Mai. Dieser liegt im II. Quartal \nThe month is May.This is in the II quarter ";
                return zuruck;
            case 6:
                zuruck = "Der Monat ist Juni. Dieser liegt im II. Quartal \nThe month is June.This is in the II quarter ";
                return zuruck;
            case 7:
                zuruck = "Der Monat ist Juli. Dieser liegt im III. Quartal \nThe month is July. This is in the III quarter \"";
                return zuruck;
            case 8:
                zuruck = "Der Monat ist August. Dieser liegt im III. Quartal \nThe month is August. This is in the III quarter";
                return zuruck;
            case 9:
                zuruck = "Der Monat ist September. Dieser liegt im III. Quartal \nThe month is September. This is in the III quarter";
                return zuruck;
            case 10:
                zuruck = "Der Monat ist Oktober. Dieser liegt im IV. Quartal \nThe month is October. This is in the IV quarter";
                return zuruck;
            case 11:
                zuruck = "Der Monat ist November. Dieser liegt im IV. Quartal \nThe month is November. This is in the IV quarter";
                return zuruck;
            case 12:
                zuruck = "Der Monat ist Dezember. Dieser liegt im IV. Quartal \nThe month is December. This is in the IV quarter";
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