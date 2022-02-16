package doWhile;

import java.util.Random;
import java.util.Scanner;

public class AufgabeDoWhile {
    public static void main(String[] args) {

        //Aufgabe A
        int zahlA = 2;
        do {
            System.out.println(zahlA);
            zahlA++;
        } while (zahlA <= 5);

        System.out.println("------------");
        //Aufgabe B

        int zahlB = -10;
        do{
            System.out.print(zahlB +" ");
            zahlB+=3;
        } while(zahlB < 0);

        System.out.println("");
        System.out.println("-------------");

        //        Aufgabe C
        System.out.println("----------------");

        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        char  buchstaben;
        int versuche = 0;
        char randomBuchstaben = 'c';

        do {
//          randomBuchstaben = (char) (ran.nextInt(26) + 'a');
            System.out.println("Geben Sie einen Buchstaben ein: ");
            buchstaben = sc.next().charAt(0);
            versuche++;

            if (randomBuchstaben == buchstaben){
                System.out.println("richtg.!");
                System.out.println("Sie haben " +versuche+ " benötigt!" );
                break;
            }
            else
                System.out.println("falsch.!");

        } while(versuche<3);

        if ( randomBuchstaben != buchstaben ){
            System.out.println("Sie haben den Buchstaben in " +versuche+ " Versuchen nicht erraten, der gesuchte Buchstabe war: " +randomBuchstaben);
        }


    }
}
