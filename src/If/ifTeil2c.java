package If;

import java.util.Scanner;

public class ifTeil2c {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Geben Sie die erste Zahl: ");
        int nummer1 = input.nextInt();
        System.out.println("Geben Sie die zweite Zahl: ");
        int nummer2 = input.nextInt();
        System.out.println("Geben Sie die dritte Zahl: ");
        int nummer3 = input.nextInt();

        if (nummer1>nummer2 && nummer1>nummer3)
            System.out.println("Die grösste Zahl ist Zahl1, ihr Wert ist " +nummer1+ "!");
        else
            if (nummer2>nummer3)
                System.out.println("Die grösste Zahl ist Zahl2, ihr Wert ist " +nummer2+ "!");
            else
                System.out.println("Die grösste Zahl ist Zahl3, ihr Wert ist " +nummer3+ "!");


    }



}
