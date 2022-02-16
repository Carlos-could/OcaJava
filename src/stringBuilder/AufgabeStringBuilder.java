package stringBuilder;

import java.util.Scanner;

public class AufgabeStringBuilder {
    public static void main(String[] args) {
        //Aufgabe A
        StringBuilder Queltext = new StringBuilder("xxxx-xxxx-xxxx");

        //Aufgabe B
        Scanner sc = new Scanner(System.in);
        System.out.print("Geben Sie die Kartenummer: ");
        StringBuilder kartenummer = new StringBuilder(sc.next());

        System.out.println("Die Kreditkartennummer im Klartextt lautet: "+ kartenummer);
        //Aufgabe C
        StringBuilder sub = new StringBuilder();
        StringBuilder mix = new StringBuilder(19);
        sub = new StringBuilder(kartenummer.substring(14, 19));
        mix.append(Queltext);
        mix.append(sub);
        System.out.println("Die maskierte Nummer lautet: "+mix);

    }


}
