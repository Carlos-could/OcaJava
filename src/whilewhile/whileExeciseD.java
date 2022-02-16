package whilewhile;

import java.util.Scanner;
import java.lang.Math;

public class whileExeciseD {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean x = true;
        int versuche = 0;
        int random = (int)(Math.random()*10+1);

        while (x){
            System.out.println("Geben Sie die zu erratende Zahl ein: ");
            int zahl = input.nextInt();
            versuche++;

            if (zahl == random){
                System.out.println("richtig!");
                System.out.println("Sie haben die Zahl " +zahl+ " erraten!");
                System.out.println("Sie haben " +versuche+ " Versuche benötigt!");
                x = false;
            }
            else {
                System.out.println("falsch!");
            }
        }


    }
}
