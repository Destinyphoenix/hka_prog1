package Aufgabe_1;

public class Brakes {
    private String brakeType;

    public Brakes(String brakeType) {
        if (brakeType == "Felgenbremsen") {
            this.brakeType = brakeType;
        } else if (brakeType == "Scheibenbremsen") {
            this.brakeType = brakeType;
        } else if (brakeType == "Trommelbremsen") {
            this.brakeType = brakeType;
        } else {
            this.brakeType = "n.A.";
        }
    }

    public String toString() {
        return this.brakeType;
    }
}
