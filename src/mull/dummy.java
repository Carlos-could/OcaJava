package mull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class dummy {
    public static void main(String[] args) {
//        int a = 0;
//        int b = 1;
//        int max = 0;
//        max = ( a > b ) ? a : b;
//
//        System.out.println(max);
//
//        int i=5;
//        int j = 6;
//        System.out.print(i < j ? i+" es Menor " + j : i+" es Mayor"+j);

//        ArrayList<Integer> ArrayList;
        ArrayList <Integer> lista = new ArrayList<>();
        lista.add(50);
        lista.add(51);
        lista.add(52);


        System.out.println(lista.get(1));
        System.out.println(lista.getClass());
        System.out.println(lista.size());
        System.out.println(lista.isEmpty());
        System.out.println(lista.clone());
        System.out.println(lista.clone());

        for (Integer l:lista){
            System.out.println(l);
        }



    }
}


