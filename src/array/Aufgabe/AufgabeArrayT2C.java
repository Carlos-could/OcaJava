package array.Aufgabe;

import java.util.Objects;
import java.util.Scanner;

public class AufgabeArrayT2C {
    public static void main(String[] args) {

        String [] liste = {"Schmidt", "Precht", "Niedeggen", "Müller", "Simon"};
        Scanner sc = new Scanner(System.in);

        for (int i=0; i<5; i++){
            System.out.println(liste[i]);
        }

        System.out.println("Geben Sie den zu suchenden Nachnamen ein: ");
        String suchende = sc.next();

        for (int i=0; i<5; i++){
            if (Objects.equals(suchende, liste[i]))
                System.out.println("Der Nachname "  +suchende+ " wurde in der Liste gefunden!");
            else if (i==4)
                System.err.println("Der Nachname "  +suchende+ " wurde nicht in der Liste gefunden!");
        }

    }
}
