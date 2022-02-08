package If;

public class ifTeil1 {

    public static void main(String[] args) {

        boolean wert = true;
//		// One
//		if (wert)
//			System.out.println(9);
//		else
//			System.out.println(12);
//
//		//Zwei
//		int ausdruck = wert? 9:12;
//		System.out.println(ausdruck);


        //Drei
        int ausdruck2;
        if (wert) {
            ausdruck2 = 9;
        }
        else {

            ausdruck2 = 12;
        }
        System.out.println(ausdruck2);

        //Vier
        if (wert)
            ausdruck2 = 9;
        else
            ausdruck2 = 12;
        System.out.println(ausdruck2);

    }

}

