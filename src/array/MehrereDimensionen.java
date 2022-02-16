package array;

public class MehrereDimensionen {
    public static void main(String[] args) {
        int[] zahlen[];
        zahlen = new int[4][7];

        zahlen[0][0] = 42;


        //das array ausgeben
//        for(int[] werte : zahlen) {
//            for (int wert : werte)
//                System.out.print(wert + " ");
//            System.out.println();
//        }

        for (int i=0; i < zahlen.length; i++){
            for (int j=0; j< zahlen[1].length; j++)
             //   zahlen[i][j] = (int)(Math.random()*33+1);
                System.out.print(zahlen[i][j] +" ");
            System.out.println();
        }
        System.out.println("------");
        System.out.println(zahlen.length);
    }

}
