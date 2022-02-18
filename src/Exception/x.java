package Exception;
import java.lang.NullPointerException;
import java.lang.NumberFormatException;
import java.lang.Throwable;

    public class x {


        public static void main(String[] args) {
            System.out.println("Start-main()");
            String vorname ="Jens";
            String nachname =null;
            System.out.println(vorname);
            System.out.println(nachname);


            try {
                System.out.println(vorname.toString());
                System.out.println(nachname.toString());
            }
            catch(NullPointerException npe)
            {
                if(vorname ==null ||  nachname==null)
                    System.out.println("Das ist NullPointerException");

                npe.printStackTrace();

//            System.out.println(npe.getMessage());
                System.out.println("Catch");
            }
            System.out.println("Ende-main()");
        }


    }
