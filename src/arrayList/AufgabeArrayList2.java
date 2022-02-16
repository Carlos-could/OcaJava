package arrayList;

import java.util.ArrayList;

public class AufgabeArrayList2 {
    public static void main(String[] args) {
        ArrayList<Integer> listNummer = new ArrayList<>();

        //Aufgabe1
        listNummer.add(1);
        listNummer.add(11);
        listNummer.add(22);
        listNummer.add(3);
        listNummer.add(33);
        //Aufgabe2
        int ran;
        for (int i=0; i<5;i++){
            ran = (int) (Math.random()*100);
            listNummer.add(ran);
        }
        //Aufgabe3
        for (int i=0; i<listNummer.size();i++){
            System.out.print(listNummer.get(i));
            if (i!= listNummer.size()-1)
                System.out.print(", ");
        }
        System.out.println();
        //Aufgabe4
        listNummer.remove(2);
        listNummer.add(90);
        //Aufgabe5
        System.out.println(listNummer);
        //Aufgabe6
        listNummer.set(2,-100000);
        //Aufgabe7
        System.out.println(listNummer);
        //Aufgabe8
        int nummer = 2;
        boolean inhalt = listNummer.contains(nummer);
        System.out.println(inhalt? "Hat die Nummer "+nummer: "Hat nicht die Nummer " +nummer);


    }
}
