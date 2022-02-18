package klassen.ubung1;

public class Main {
    public static void main(String[] args) {

        Produkt mouse = new Produkt("Mouse Logitec G502","optischem Sensor, RGB-Beleuchtung", 111112222, 30.15, 100, "A-01");
        Produkt tastatur = new Produkt("Tastatur Logitec POP","Keys Mechanische Bluetooth-Verbindung",333334444, 20.55, 120, "B-02");
        Produkt laptop = new Produkt("Laptop Lenovo IdeaPad 3i","15,6 Zoll - Slim Notebook",555556666,390.05, 85, "C-01");

//        mouse.setName("Mouse Logitec G502");
//        mouse.setEanNummer(111112222);
//        mouse.setBeschreibung("Logitech G502 optischem Sensor, RGB-Beleuchtung");
//        mouse.setRegalNummer("A-01");
//        mouse.setNettoPreis(30.15);
//        mouse.setStuckanzahl(100);

//        tastatur.setName("Tastatur Logitec POP");
//        tastatur.setEanNummer(333334444);
//        tastatur.setBeschreibung("Keys Mechanische Bluetooth-Verbindung");
//        tastatur.setRegalNummer("B-02");
//        tastatur.setNettoPreis(20.55);
//        tastatur.setStuckanzahl(120);

//        laptop.setName("Laptop Lenovo IdeaPad 3i");
//        laptop.setEanNummer(555556666);
//        laptop.setBeschreibung("15,6 Zoll - Slim Notebook");
//        laptop.setRegalNummer("C-01");
//        laptop.setNettoPreis(390.05);
//        laptop.setStuckanzahl(85);

        System.out.println("Name\t\t\t" +mouse.getName());
        System.out.println("Beschreibung:\t" + mouse.getBeschreibung());
        System.out.println("Nettopreis:\t\t" +mouse.getNettoPreis());
        System.out.println("Bruttopreis:\t" +mouse.bruttoPreis(mouse.getNettoPreis()));
        System.out.println("Stueckanzahl:\t"+mouse.getStuckanzahl());
        System.out.println("RegalNummer:\t"+mouse.getRegalNummer());
        System.out.println("EanNummer:\t\t" +mouse.getEanNummer());
        System.out.println("Lagerwert:\t\t"+  mouse.lagerWert(mouse.getNettoPreis(), mouse.getStuckanzahl()) );
        System.out.println(mouse.toString());

        System.out.println("Name\t\t\t" +tastatur.getName());
        System.out.println("Beschreibung:\t" + tastatur.getBeschreibung());
        System.out.println("Nettopreis:\t\t" +tastatur.getNettoPreis());
        System.out.println("Bruttopreis:\t" +tastatur.bruttoPreis(tastatur.getNettoPreis()));
        System.out.println("Stueckanzahl:\t"+tastatur.getStuckanzahl());
        System.out.println("RegalNummer:\t"+tastatur.getRegalNummer());
        System.out.println("EanNummer:\t\t" +tastatur.getEanNummer());
        System.out.println("Lagerwert:\t\t"+ tastatur.lagerWert(tastatur.getNettoPreis(), tastatur.getStuckanzahl()) );
        System.out.println(tastatur.toString());

        System.out.println("Name\t\t\t" +laptop.getName());
        System.out.println("Beschreibung:\t" + laptop.getBeschreibung());
        System.out.println("Nettopreis:\t\t" +laptop.getNettoPreis());
        System.out.println("Bruttopreis:\t" +laptop.bruttoPreis(laptop.getNettoPreis()));
        System.out.println("Stueckanzahl:\t"+laptop.getStuckanzahl());
        System.out.println("RegalNummer:\t"+laptop.getRegalNummer());
        System.out.println("EanNummer:\t\t" +laptop.getEanNummer());
        System.out.println("Lagerwert:\t\t"+ laptop.lagerWert(laptop.getNettoPreis(), laptop.getStuckanzahl()) );
        System.out.println(laptop.toString());

        System.out.println("Insgesamt Wert: "+ (
                        mouse.lagerWert(mouse.getNettoPreis(), mouse.getStuckanzahl()) +
                        tastatur.lagerWert(tastatur.getNettoPreis(), tastatur.getStuckanzahl()) +
                        laptop.lagerWert(laptop.getNettoPreis(), laptop.getStuckanzahl())
        ) );

        System.out.println(laptop.toString());
        System.out.println("Sind in der gleiche Regal, laptop und mouse :" +laptop.equals(mouse));
        System.out.println(laptop.hashCode());




    }

}
