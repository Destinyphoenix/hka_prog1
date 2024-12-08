package Aufgabe_1;

public class gearShift extends Bike {
    private String name;
    private String type;

    public gearShift(String name, String type, String componentName) {
        super(name);

        this.name = componentName;
        this.type = type;
        if(type == "") {
            this.type = "n.A.";
        }
    }

    public String toString() {
        return "Schaltung des Fahrrads: " + this.type;
    }
}
