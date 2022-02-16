package forSchleifen;

public class Test{
    public static void main(String[] args) {
        for (int i = 0; i<10; i++){

            for (int j = 0; j<10; j++){
                System.out.print(i * j + "");
                if (j==5)
                    continue;
            }

            System.out.println(i);
        }
    }
}