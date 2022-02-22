package TryCatch;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Obs {
    public static void main(String[] args) {

        ArrayList<String> liste = new ArrayList<>();

        File f = new File("src/TryCatch/obs.txt");
        String zeile = "";

        try {
            Scanner scanner = new Scanner(f);

            for (int i=0; i<3;i++){
                zeile = scanner.nextLine();
                System.out.println(zeile);
                liste.add(zeile);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Catch");
            System.out.println(e.getMessage());
        }


    }
}
