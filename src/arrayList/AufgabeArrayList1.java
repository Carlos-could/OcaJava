package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class AufgabeArrayList1 {
    public static void main(String[] args) {

        ArrayList<String> Tiere = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String input;
        for (int i=1; i<5; i++){
            System.out.println("Geben Sie bitte die " +i+ ". Tierart ein:" );
            input=sc.next();
            Tiere.add(input);
        }
        for (int i = 0; i<Tiere.size(); i++){
            System.out.print(Tiere.get(i));
            if (i != Tiere.size()-1)
                System.out.print(", ");
        }
        System.out.println();
        for (String t: Tiere){
            System.out.println(t);
        }


    }
}
