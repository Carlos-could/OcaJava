package Static;



public class Ente {

    public static void main(String[] args) {

        Ente ente1 = new Ente();
        Ente ente2 = new Ente();

        ente1.name = "Lucas";
        ente2.name = "Lima";
        ente1.ort = "Schwimmbad";
        ente2.ort = "Isar";


        System.out.println( ente1.woBistDu());
        System.out.println( ente2.woBistDu());
    }

    String name;
    String ort;

    void schwimmWohin(String ort){
        this.ort = ort;
        System.out.println(this.name + ": ich bin jetzt hier: " + ort);
    }

    String woBistDu() {
        return this.name + ": ich bin immer noch hier: " + this.ort;
    }
}

