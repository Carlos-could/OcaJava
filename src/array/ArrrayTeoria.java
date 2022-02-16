package array;

import java.util.Arrays;

public class ArrrayTeoria {
    public static void main(String[] args) {

        int zahl;
        String zutat1;
        String zutat2;
        String zutat3;
        String zutat4;
        String zutat5;
        String zutat6;
        String zutat7;
        String zutat8;

        String[] zutaten;
        int [] zahlen;
        float[] kommazahlen;

        zahl = 1;
        zahlen = new int [10]; //{1,2,3,4,5,6};
        zutaten = new String[10];

        //v1
        int [] zahlen1;
        zahlen1 = new int[3];

        //v2
        int [] zahlen2 = new int [3];

        //v3
        int[] zahlen3;
        zahlen3 = new int[] {1,2,3};

        //v4
        int[] zahlen4 = {1,2,3};

//        System.out.println(zahlen4[0]);

        for (int j=0; j<zahlen4.length; j++){
            System.out.print(zahlen4[zahlen4.length - 1 -j]);

            //System.out.print(zahlen4[j]);
        }
        System.out.println("");

        for (int x : zahlen4){
            System.out.println(x);
        }

        System.out.println(Arrays.toString(zahlen4)) ; //nicht OCA






    }

}
