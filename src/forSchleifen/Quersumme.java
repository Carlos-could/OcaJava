package forSchleifen;

import java.util.Scanner;

public class Quersumme {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Geben Sie eine Zahl: ");
        int input = sc.nextInt();

        int cont=0;

        for (int i = 0; i<=10; ++i){
            cont++;
            input = (int) (input/Math.pow(10,i));
            System.out.println(input);
            if (input==0){
                System.out.println(cont);
                break;
            }
        }






    }
}
