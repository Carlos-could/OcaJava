package Array.Aufgabe;

import java.util.Arrays;

public class AusgabeArrayT5 {
    public static void main(String[] args) {
        //Aufgabe A
        int [][] arrayA= { {1,2},{3,4},{5,6} };
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
        int [][] arrayB = new int[2][3];

        arrayB[0][0] = 11;
        arrayB[0][1] = 22;
        arrayB[0][2] = 33;
        arrayB[1][0] = 44;
        arrayB[1][1] = 55;
        arrayB[1][2] = 66;



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
        System.out.println("-------------------");

        //Aufgabe C
        String [][] arrayC = new String [3][];
        arrayC [0] = new String [3];
        arrayC [1] = new String [2];
        arrayC [2] = new String [1];

        arrayC [0][0] = "Juan";
        arrayC [0][1] = "Carlos";
        arrayC [0][2] = "Moran";

        arrayC [1][0] = "Elroy";
        arrayC [1][1] = "Iduh";

        arrayC [2][0] = "Milica";

        for(int i=0;i<arrayC.length;i++) {
            if (arrayC[i] != null) {
                for(int j=0;j< arrayC[i].length;j++)
                    System.out.print(arrayC[i][j] + " ");
            }
            System.out.println();
        }

        for(String[] zeilen : arrayC) {
            if (zeilen != null) {
                for(String zelle : zeilen)
                    System.out.print(zelle + " " );
            }
            System.out.println();
        }
    }
}
