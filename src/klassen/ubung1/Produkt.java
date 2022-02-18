package klassen.ubung1;

import java.util.Objects;

public class Produkt {

    private String name;
    private String beschreibung;
    private int eanNummer;
    private double nettoPreis;
    private int stueckAnzahl;
    private String regalNummer;
    private final int mwss = 19; //mehrwertsteuersatz

    @Override
    public String toString() {
        return "-------------------------------------";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produkt produkt = (Produkt) o;
        return Objects.equals(regalNummer, produkt.regalNummer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regalNummer);
    }


    public Produkt(String name, String beschreibung, int eanNummer, double nettoPreis, int stueckAnzahl, String regalNummer) {
        this.name = name;
        this.beschreibung = beschreibung;
        this.eanNummer = eanNummer;
        this.nettoPreis = nettoPreis;
        this.stueckAnzahl = stueckAnzahl;
        this.regalNummer = regalNummer;
    }

//    public Produkt(){
//
//    }


    public double bruttoPreis(double nettoPreis){
        this.nettoPreis = nettoPreis;
        double brutto = nettoPreis*(100+mwss)/100;
        return Math.round(brutto * 100.00) / 100.00;
    }

    public double lagerWert(double nettoPreis, int stuckanzahl){
        this.nettoPreis = nettoPreis;
        this.stueckAnzahl = stuckanzahl;
        double lagerWert = nettoPreis*stuckanzahl;
        return Math.round(lagerWert*100.00)/100.00;
    }


    public String getName() {
        return name;
    }
//    public void setName(String name) {
//        this.name = name;
//    }
    public String getBeschreibung() {
    return beschreibung;
}
//    public void setBeschreibung(String beschreibung) {
//        this.beschreibung = beschreibung;
//    }
    public int getEanNummer() {
        return eanNummer;
    }
//    public void setEanNummer(int eanNummer) {
//        this.eanNummer = eanNummer;
//    }
    public double getNettoPreis() {
    return nettoPreis;
}
//    public void setNettoPreis(double nettoPreis) {
//        this.nettoPreis = nettoPreis;
//    }
    public int getStuckanzahl() {
    return stueckAnzahl;
}
//    public void setStuckanzahl(int stuckanzahl) {
//        stueckAnzahl = stuckanzahl;
//    }
    public String getRegalNummer() {
        return regalNummer;
    }
//    public void setRegalNummer(String regalNummer) {
//        this.regalNummer = regalNummer;
//    }
    public int getMwss() {
        return mwss;
    }

//    {
//        regalNummer = "01-01";
//        System.out.println(regalNummer);
//    }


}
