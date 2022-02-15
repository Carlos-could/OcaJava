package fechas.Aufgabe5;

import java.time.LocalDate;

public class Feiertag {

    //Fields werden mi Default Werten initialisiert
    //
    //globale Variable
    private String feiertagName; // initialisiert Null
    private LocalDate feiertagDatum = LocalDate.now();






    public String getFeiertagName() {
        return feiertagName;
    }

    public void setFeiertagName(String feiertagName) {
        this.feiertagName = feiertagName;
    }

    public LocalDate getFeiertagDatum() {
        return feiertagDatum;
    }

    public void setFeiertagDatum(LocalDate feiertagDatum) {
        this.feiertagDatum = feiertagDatum;
    }

//    public short berechneTageFeier
}
