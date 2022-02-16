package stringClass;

public class StringTeoria {
    public static void main(String[] args) {
        String vorname = "Jäns";
        String nachname = "Simön";

        vorname = vorname.toLowerCase();
        nachname = nachname.toUpperCase();

        System.out.println(vorname);
        System.out.println(nachname);

        String name = vorname.concat(nachname);
        System.out.println(name);

        System.out.println(name.contains("ä"));
        System.out.println(name.indexOf("Ö"));
        System.out.println(name.replace("ä","ae"));



    }
}
