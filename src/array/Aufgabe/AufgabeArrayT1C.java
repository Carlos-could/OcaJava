package array.Aufgabe;

public class AufgabeArrayT1C {
    public static void main(String[] args) {
        boolean [] array = new boolean[20];

        for (int i = 0; i <20; ++i){
            int boo = (int) (Math.random()*2);
//            boo==0 ?array[i] = false:array[i] = true;
            if (boo==0)
                array[i] = false;
            else
                array[i] = true;
            System.out.print(i+1 +". "+ array[i] +" ");
            if((i+1)%5==0)
                System.out.println("");
        }

    }
}
