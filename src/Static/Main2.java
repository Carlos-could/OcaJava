package Static;

public class Main2 {

    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();

        t1.i = 1;
        t2.i = 2;
        System.out.println(t1.i);
        System.out.println(t2.i);

        t1.j = 99;
        t2.j = 99;
//        Test.j=99;

        t1.j += 500;

//        System.out.println(Test.j);
        System.out.println(t1.j);
        System.out.println(t2.j);

    }
} //ENDE CLASS

class Test {
    public int i;
    public static int j=1;
}
