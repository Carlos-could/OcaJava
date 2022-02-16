package array.Aufgabe;

public class AufgabeArrayT3Reverse {
    public static void main(String[] args) {
        //e
        int [] array = {100, 50, 20, 10, 1};
        //v
        int [] v = reverse(array);
        //a
        ausgabe (v);
    }

        private static int [] reverse(int[] array) {
            int []neuArray = {0,0,0,0,0};
            for (int i=0; i<array.length; i++){
                neuArray[i] = array[array.length-1-i];
            }
            return neuArray;
        }

        private static void ausgabe(int[] v){
            for (int a : v) {
                System.out.println(a);
            }
        }

}
