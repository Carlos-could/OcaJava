package Array;

public class AufgabeArrayT3 {
    public static void main(String[] args) {
        int []array = {100, 50, 20, 10, 1};

        for (int i=0; i<6; i++){
            array[i] = array[5-i];
        }


        for (int a:array){
            System.out.println(a);
        }

    }
}
