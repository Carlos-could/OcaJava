package Static;

public class EnteStatisch {

    public static void main(String[] args) {

        EnteStatisch ente1 = new EnteStatisch();
        EnteStatisch ente2 = new EnteStatisch();

        ente1.name = "Lucas";
        ente2.name = "Lima";
        ente1.ort = "Schwimmbad";
        ente2.ort = "Isar";

        ente1.schwimmWohin("Schwimmbad");
        ente2.schwimmWohin("Isar");

        System.out.println(ente1.woBistDu());
        System.out.println(ente2.woBistDu());

        System.out.println(EnteStatisch.name);
    }

    private static String name;
    private static String ort;

    static void schwimmWohin(String ort){
        EnteStatisch.ort = ort;
        System.out.println(name + ": ich bin jetzt hier: " + ort);
    }

    static String woBistDu() {
        return name + ": ich bin immer noch hier: " + ort;
    }
}
