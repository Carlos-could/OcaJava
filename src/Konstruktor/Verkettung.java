package Konstruktor;

public class Verkettung {

        public static void main(String[] args) {

//                Verkettung v0 = new Verkettung();
//                Verkettung v1 = new Verkettung(1);
                Verkettung v2 = new Verkettung(1,2);
//                Verkettung v3 = new Verkettung(1,2,3);
                System.out.println("---------------");
        }

        int attribut1;
        int attribut2;
        int attribut3;
        {
//                attribut1= 1;
//                System.out.println(attribut1);
//                System.out.println("Initialisierungs Block");
//                System.out.println("Default: "+ this.getClass());
//                attribut2 =2;
//                System.out.println(attribut2);
//                System.out.println("Initialisierungs Block");
//                System.out.println("Default: "+ this.getClass());
//                attribut3=3;
//                System.out.println(attribut3);
//                System.out.println("Initialisierungs Block");
//                System.out.println("Default: "+ this.getClass());
        }

        public Verkettung() {
                this(500,500,500);
                System.out.println("Konstruktor Verketung 0");
//                System.out.println(this.toString());
                this.toString();

        }
        public Verkettung(int attribut1) {
//                this.attribut1 = attribut1;
                this(attribut1,500,500);
                System.out.println("Konstruktor Verketung 1");
//                System.out.println(this.toString());
                this.toString();
        }
        public Verkettung(int attribut1, int attribut2) {
                this(attribut1,attribut2,500);
//                this.attribut1 = attribut1;
//                this.attribut2 = attribut2;
                System.out.println("Konstruktor Verketung 2");
//                System.out.println(this.toString());
                this.toString();
        }
        public Verkettung(int attribut1, int attribut2, int attribut3) {
                this.attribut1 = attribut1;
                this.attribut2 = attribut2;
                this.attribut3 = attribut3;
                System.out.println("Konstruktor Verketung 3");
                System.out.println(this.toString());
//                this.toString();
        }

        @Override
        public String toString() {
                return "Verkettung{" +
                        "attribut1=" + attribut1 +
                        ", attribut2=" + attribut2 +
                        ", attribut3=" + attribut3 +
                        '}';
        }
}
