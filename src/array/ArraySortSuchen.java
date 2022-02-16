package array;

import java.util.Arrays;

public class ArraySortSuchen {
    public static void main(String[] args) {

        int[] zahlen= {4,2,5,13,1,0,150};

//        for (int zahl : zahlen){
//            System.out.println(zahl);
//        }
//        System.out.println("----");
//        //sortieren: sortiert aufsteigend
//        Arrays.sort(zahlen);
//        for (int zahl : zahlen){
//            System.out.println(zahl);
//        }
//
//        System.out.println("----");
//        //Absteigen
//        for (int i =0; i<zahlen.length; i++){
////            System.out.println(zahlen[zahlen.length-i-1]);
//            System.out.println(zahlen[zahlen.length-i-1]);
//        }
//        System.out.println("----");

        //Suchen - busca la posicion
        System.out.println( Arrays.binarySearch(zahlen,150));

    }
}
