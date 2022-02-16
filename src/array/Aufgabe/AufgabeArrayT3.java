package array.Aufgabe;

public class AufgabeArrayT3 {
    public static void main(String[] args) {
        int []array = {100, 50, 20, 10, 1};
        int []neuArray = {0,0,0,0,0};

        for (int i=0; i<array.length; i++){
            neuArray[i] = array[array.length-1-i];
        }

        for (int a:neuArray){
            System.out.println(a);
        }



    }
}
