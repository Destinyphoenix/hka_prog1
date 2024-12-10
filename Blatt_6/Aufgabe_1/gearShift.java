package Aufgabe_1;

public class gearShift {
    private String gearType;

    public gearShift(String gearType) {
        if (gearType == "Kettenschaltung") {
            this.gearType = gearType;
        } else if (gearType == "Nabenschaltung") {
            this.gearType = gearType;
        } else {
            this.gearType = "n.A.";
        }
    }

    public String toString() {
        return this.gearType;
    }
}
