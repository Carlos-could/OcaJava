package If;

import java.util.Scanner;
public class ifTeil3 {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("Geben Sie eine Vorname: ");
        String vorname = input.next();


        if(vorname.equals("Jens")){
            System.out.println("GFN-Mitarbeiter");
            if (vorname.equals("Ellen"))
                System.out.println("GFN-Mitarbeiter");
        }
        else
            System.out.println("Keine GFN-Mitarbeiter");
    }
}
