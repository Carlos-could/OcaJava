package stringClass;

import java.util.Scanner;

public class AufgabeWortRaten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lassem Sie ein beliebiges Wort eingeben: ");
        String input = sc.next();
//        String input = "JuanCarlosa";//2 - 5 -10
        char buchstabe = 'e';


        int index = input.indexOf(buchstabe);
        int [] positionen = {index};
        while (index>=0){
                index =  input.indexOf(buchstabe, index+1);
                if (index>0)
                    System.out.println(index);//5-13-16
        }



    }
}
