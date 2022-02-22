package Static;

public class EnteStatisch {

    public static void main(String[] args) {

        Ente ente1 = new Ente();
        Ente ente2 = new Ente();

        ente1.schwimmWohin("Schwimmbad");
        ente2.schwimmWohin("Isar");
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
