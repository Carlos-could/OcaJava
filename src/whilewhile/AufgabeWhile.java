package whilewhile;

import java.util.Scanner;

public class AufgabeWhile {
    public static void main(String[] args) {

        //Aufgabe E

        Scanner sc = new Scanner(System.in);
        int ran = (int) (Math.random()*10+1);
        int versuche = 1;
        while (versuche<=3){
            System.out.print("Geben Sie eine Zahl: ");
            int meineZahl = sc.nextInt();

            if (ran == meineZahl){
                System.out.println("richtig.!");
                System.out.println("Sie haben die Zahl " +ran+ " erraten!");
                System.out.println("Sie haben " +versuche+ " Versuche benötigt");
                break;
            }
            else
                System.out.println("falsch");
            versuche++;
        }
        System.out.println("Game Over");



    }
}
