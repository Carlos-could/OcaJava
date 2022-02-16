package forSchleifen;

public class exercisesABCDEF {
    public static void main(String[] args) {


////        aufgabe A
//        for (int a=-1; a<=4; a++){
//            System.out.println(a);
//        }

////        aufgabe B
//        for (int b = 11; b<=22; b++){
//            System.out.print(b +" ");
//        }

//        aufgabe C
//        for ( float f=-4.1f; f<=2f; f++){
//
//            System.out.println(Math.round(f*100.0)/100.0);
//            if (f==0.1f)
//                f+=1.2f;
//        }

////        aufgabe D1
//        for (int d=1; d<=19; d+=3){
//            System.out.print(d +" ");
//        }


//        aufgabe D2
//        for (int i=1;  i<11;i++){
//
//            for (int d=10; d>=1; d--){
//                System.out.print(d +" ");
//                i=11;
//            }
//        }

//        aufgabe F
        for (int i=1;  i<11;i++){
            if (i == 3 || i == 6 ||i == 8 ||i == 9 ||i == 10 )
                continue;
            else
                System.out.print(i +" ");


        }


    }
}
