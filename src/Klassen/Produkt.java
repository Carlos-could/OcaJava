package Klassen;

public class Produkt {

    private String name;
    private int eanNummer;
    private String beschreibung;
    private String regalNummer;
    private double nettoPreis;
    final byte mehrwertsteuersatz = 19;
    private int Stuckanzahl;

    public int getStuckanzahl() {
        return Stuckanzahl;
    }

    public void setStuckanzahl(int stuckanzahl) {
        Stuckanzahl = stuckanzahl;
    }

    public double bruttoPreis(double nettoPreis){
        this.nettoPreis = nettoPreis;
        double brutto = nettoPreis*(100+mehrwertsteuersatz)/100;
        double bruttoround = Math.round(brutto * 100.0) / 100.0;
        return bruttoround;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEanNummer() {
        return eanNummer;
    }

    public void setEanNummer(int eanNummer) {
        this.eanNummer = eanNummer;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

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

    public byte getMehrwertsteuersatz() {
        return mehrwertsteuersatz;
    }
}
