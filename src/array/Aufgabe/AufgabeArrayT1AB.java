package array.Aufgabe;

import java.util.Scanner;

public class AufgabeArrayT1AB {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] array = new String[4];
        System.out.print("Bitte Geben Sie den 1.Vornamen ein: ");
        array[0] = sc.next();
        System.out.print("Bitte Geben Sie den 2.Vornamen ein: ");
        array[1] = sc.next();
        System.out.print("Bitte Geben Sie den 3.Vornamen ein: ");
        array[2] = sc.next();
        System.out.print("Bitte Geben Sie den 4.Vornamen ein: ");
        array[3] = sc.next();

        //-------------------for
        for (int i = 0; i< array.length; i++){
            System.out.println(array[i]);
        }
        //-------------------while
        int i =0;
        while (i< array.length){
            System.out.println(array[i]);
            i++;
        }

        //--------------------do-while
        int y = 0;
        do {
            System.out.println(array[y]);
            y++;
        } while (y<array.length);
    }
}
