package TryCatch;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.channels.FileLock;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {

        File f = new File ("src/TryCatch/daten.txt");

        try {
            Scanner scanner = new Scanner(f);

            System.out.println(scanner.next());
            System.out.println(scanner.next());
            System.out.println(scanner.next());

        } catch (FileNotFoundException e){
//            System.out.println(e.getMessage());
//            System.out.println(e.toString());
        }
        System.out.println("Programm Ende");
    }
}
