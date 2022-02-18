package klassen.ubung2;

public class Produkt {
    private String name;
    private String beschreibung;
    private int eanNummer;
    private String regalNummer;
    private double nettoPreis;
    private final int  mwss=19; //mehrwertsteuersatz
    private int stueckAnzahl;

    public Produkt(String name, String beschreibung, int eanNummer) {
        this.name = name;
        this.eanNummer = eanNummer;
        this.beschreibung = beschreibung;
    }

    //////////////////////////////////////////////////////
    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public int getEanNummer() {
        return eanNummer;
    }

//    public void setEanNummer(int eanNummer) {
//        this.eanNummer = eanNummer;
//    }

    public String getBeschreibung() {
        return beschreibung;
    }

//    public void setBeschreibung(String beschreibung) {
//        this.beschreibung = beschreibung;
//    }

    public String getRegalNummer() {
        return regalNummer;
    }

    public void setRegalNummer(String regalNummer) {
        this.regalNummer = regalNummer;
    }

    public double getNettoPreis() {
        return nettoPreis;
    }

    public void setNettoPreis(double nettoPreis) {
        this.nettoPreis = nettoPreis;
    }

    public int getMwss() {
        return mwss;
    }

    public int getStueckAnzahl() {
        return stueckAnzahl;
    }

    public void setStueckAnzahl(int stueckAnzahl) {
        this.stueckAnzahl = stueckAnzahl;
    }


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



}
