package arrayList;

import java.util.ArrayList;

public class ArrayListTeoria {
    public static void main(String[] args) {
        //ArrayList
        Tier affe = new Tier();
        String txt = new String("1");

        ArrayList<Integer> liste = new ArrayList<Integer>();

        Integer zahl = new Integer("1");

        //primitive Datentypen ->klassendatentyp
        liste.add(zahl);
        liste.add(11);
        liste.add(17);
        System.out.println(liste);
        for (Integer i : liste){
            System.out.print(i+ " ");
        }
        System.out.println();
        for (int i=0; i<liste.size(); i++){
            System.out.print(i+ " ");
        }
    }
}

class Tier{

}
