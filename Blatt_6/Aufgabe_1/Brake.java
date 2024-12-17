package Blatt_6.Aufgabe_1;

 abstract class Brake  {

    private String brakeType;

    public  Brake(String brakeType) {
        this.brakeType = brakeType;
    }

    public String toString() {
        return this.brakeType;
    }
}
