package array.Aufgabe;

import java.util.Scanner;

public class AufgabeArrayT2AB {
    public static void main(String[] args) {

//        Aufgabe A
//        int menge = 6;
//        char [] arrayA = new char[menge];
//        int  quersumme = 0;
//
//
//        int i = 0;
//        do {
//            char ran = (char) (Math.random()*57+1);
//
//            if (ran >= 48 && ran <=57){
//                arrayA[i] = ran;
//                quersumme +=  (ran-48);
//                i++;
//            }
//        } while(i<6);
//
//        System.out.print("Die Quersumme von: ");
//        for (char a : arrayA){
//            System.out.print(" "+a);
//        }
//        System.out.println(" ist " +  quersumme );
//
//        System.out.println("---------------");
//        Aufgabe B

        int arrayB[] = new int [4];
        int gross1 = 0;
        int gross2 = 0;
        int grosste = 0;

        Scanner sc = new Scanner(System.in);
        for (int x=0, j=1; x<4; x++, j++){
            System.out.println("Eingabe der " +j+ ". Zahl:");
            arrayB[x] = sc.nextInt();
        }
        if (arrayB[0]>arrayB[1])
            gross1 = arrayB[0];
        else
            gross1 = arrayB[1];

        if (arrayB[2]>arrayB[3])
            gross2 = arrayB[2];
        else
            gross2 = arrayB[3];

        if (gross1>gross2)
            grosste = gross1;
        else
            grosste = gross2;

        System.out.println("Der grösste Wert ist:" +grosste);



    }
}
