package Vererbung;

public class Main {
    public static void main(String[] args) {
        Superklasse superk = new Superklasse();
        System.out.println(superk.i);
        System.out.println(superk.getI());

        Subklasse subk = new Subklasse();
        System.out.println(subk.i);
        System.out.println(subk.getI());

        SubSubklasse subsubk = new SubSubklasse();

    }
}

class Superklasse extends Object{
    public int i;

    public  int getI(){
        return i;
    }
}

class Subklasse extends Superklasse{
    public String vorname;

}

class SubSubklasse extends  Subklasse{
    public String nachname;
}