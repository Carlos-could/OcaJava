package StringBuilder;

import java.util.Scanner;

public class AufgabeStringBuilder2 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Geben Sie die Kartenummer: ");
//        StringBuilder idkarte = new StringBuilder(sc.next());


        StringBuilder idkarte = new StringBuilder("ID6258431979");

        System.out.println(idkarte);
        System.out.println(idkarte.charAt(2));//6
        System.out.println((idkarte.charAt(2)-48)*2);
        short x = (short) ((idkarte.charAt(2)-48)*2);
        System.out.println(x);
        System.out.println(idkarte.toString());







    }
}
