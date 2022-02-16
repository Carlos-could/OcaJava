package whilewhile;

import java.lang.Math;

public class exerciseA {
    public static void main(String[] args) {

//        int a = 4;
//        while(a<=9){
//            System.out.println(a);
//            a++;
//        }
//
//        System.out.println("---------------");
//
//        int b = -10;
//        while(b<=0){
//            System.out.print(b + " ");
//            b+=2;
//        }
//        System.out.println();
//        System.out.println("---------------");
//
//        int c = 20;
//        while(c>=4){
//            System.out.print(c + " ");
//            c-=4;
//        }
//
//        System.out.println();
//        System.out.println("---------------");


        boolean probiertMal = true;

        while (probiertMal){
            int zahl1 = (int)(Math.random()*6+1);
            int zahl2 = (int)(Math.random()*6+1);
            int zahl3 = (int)(Math.random()*6+1);

            if(zahl1 != zahl2  &&  zahl1 != zahl3  &&  zahl2 != zahl3){
                System.out.println(zahl1);
                System.out.println(zahl2);
                System.out.println(zahl3);
                probiertMal = false;
            }
        }
    }
}
