package Array;

import java.util.Arrays;

public class AusgabeArrayT5 {
    public static void main(String[] args) {
        //Aufgabe A
        int [][] arrayA= { {1,2},{3,3},{5,6} };
        //System.out.println(Arrays.deepToString(array2D));
        //System.out.println("------");
        for(int i=0;i<arrayA.length;i++) {
            if (arrayA[i] != null) {
                for(int j=0;j< arrayA[i].length;j++)
                    System.out.print(arrayA[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("-------------------");

        for(int[] zeilen : arrayA) {
            if (zeilen != null) {
                for(int zelle : zeilen)
                    System.out.print(zelle + " " );
            }
            System.out.println();
        }
        System.out.println("-------------------");

        //Aufgabe B
        int [][] arrayB = new int[][] {{11,22}, {33,44}, {55,66}};
        for(int i=0;i<arrayB.length;i++) {
            if (arrayB[i] != null) {
                for(int j=0;j< arrayB[i].length;j++)
                    System.out.print(arrayB[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("-------------------");

        for(int[] zeilen : arrayB) {
            if (zeilen != null) {
                for(int zelle : zeilen)
                    System.out.print(zelle + " " );
            }
            System.out.println();
        }

        //Aufgabe C
        String [][] arrayC = new String [3][]; // 2. Dimension wird erstmal nicht angegeben!
        arrayC [0] = new String [1];
        arrayC [1] = new String [2];
        arrayC [2] = new String [3];



        for(int i=0;i<arrayB.length;i++) {
            if (arrayB[i] != null) {
                for(int j=0;j< arrayB[i].length;j++)
                    System.out.print(arrayB[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("-------------------");

        for(int[] zeilen : arrayB) {
            if (zeilen != null) {
                for(int zelle : zeilen)
                    System.out.print(zelle + " " );
            }
            System.out.println();
        }

    }
}
