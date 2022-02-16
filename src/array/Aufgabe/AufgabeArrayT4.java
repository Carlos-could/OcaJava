package array.Aufgabe;

import java.util.Arrays;
import java.util.Scanner;

public class AufgabeArrayT4 {
    public static void main(String[] args) {
        //Aufgabe A
        int[] array = {100, 150, 20, 100, 1};
        Arrays.sort(array);
        for (int a : array) {
            System.out.print(a + ", ");
        }
        System.out.println();
        System.out.println("-------");

        //Aufgabe B
        String v = verarbeitung(array);
        ausgabe (v);
    }

    private static String verarbeitung(int[] array) {
        Scanner sc = new Scanner(System.in);
        int position;
        String ausgabe;

        System.out.println("Geben Sie die zu suchende Zahl ein: ");
        int input = sc.nextInt();

        position = Arrays.binarySearch(array, input);

        if (position > 0)
            ausgabe = input + " wurde fegunden an Position " + position;
        else
            ausgabe = input + " wurde nicht gefunden";
        return ausgabe;
    }
    private static void ausgabe(String v){
        System.out.println(v);
    }

}//ende class