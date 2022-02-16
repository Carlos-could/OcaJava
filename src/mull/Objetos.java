package mull;

public class Objetos {
    int edad = 24;
    String nombre = "JC";

    public void saludar(){
        System.out.println("Hola" + nombre);
    }

    public static void main(String[] args) {
        Objetos ob1 = new Objetos();
        ob1.saludar();
    }
}
