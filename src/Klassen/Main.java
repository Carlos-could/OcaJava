package Klassen;

public class Main {
    public static void main(String[] args) {

        Produkt mouse = new Produkt();
        Produkt tastatur = new Produkt();
        Produkt laptop = new Produkt();

        mouse.setName("Mouse Logitec G502");
        mouse.setEanNummer(111112222);
        mouse.setBeschreibung("Logitech G502 optischem Sensor, RGB-Beleuchtung, 11 programmierbare Tasten, PC/Mac - Schwarz");
        mouse.setRegalNummer("01-01-01");
        mouse.setNettoPreis(30.15);
        mouse.setStuckanzahl(100);

        tastatur.setName("Tastatur Logitec POP");
        tastatur.setEanNummer(333334444);
        tastatur.setBeschreibung("Logitech POP Keys Mechanische kabellose Tastatur mit anpassbaren Emoji-Tasten, Bluetooth-Verbindung");
        tastatur.setRegalNummer("02-01-01");
        tastatur.setNettoPreis(20.50);
        tastatur.setStuckanzahl(120);

        laptop.setName("Laptop Lenovo IdeaPad 3i");
        laptop.setEanNummer(555556666);
        laptop.setBeschreibung("Lenovo IdeaPad 3i Laptop(15,6 Zoll) Slim Notebook (Intel Celeron 6305, 4GB RAM, 128GB SSD, Intel UHD-Grafik, Win11");
        laptop.setRegalNummer("03-01-01");
        laptop.setNettoPreis(390.00);
        laptop.setStuckanzahl(85);

        System.out.println(mouse.getName());
        System.out.println(mouse.getBeschreibung());
        System.out.println(mouse.getNettoPreis());
        System.out.println(mouse.bruttoPreis(mouse.getNettoPreis()));
        System.out.println(mouse.getStuckanzahl());
        System.out.println(mouse.getRegalNummer());
        System.out.println(mouse.getEanNummer());

        System.out.println("------------------");
        System.out.println(tastatur.getName());
        System.out.println(tastatur.getBeschreibung());
        System.out.println(tastatur.getNettoPreis());
        System.out.println(tastatur.bruttoPreis(tastatur.getNettoPreis()));
        System.out.println(tastatur.getStuckanzahl());
        System.out.println(tastatur.getRegalNummer());
        System.out.println(tastatur.getEanNummer());
        System.out.println("------------------");
        System.out.println(laptop.getName());
        System.out.println(laptop.getBeschreibung());
        System.out.println(laptop.getNettoPreis());
        System.out.println(laptop.bruttoPreis(laptop.getNettoPreis()));
        System.out.println(laptop.getStuckanzahl());
        System.out.println(laptop.getRegalNummer());
        System.out.println(laptop.getEanNummer());




    }



}
