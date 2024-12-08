package Aufgabe_1;

public class Brakes extends Bike {
    private String name;
    private String type;

    public Brakes(String name, String type, String componentName) {
        super(name);

        this.name = componentName;
        this.type = type;
        if(type == "") {
            this.type = "n.A.";
        }
    }

    public String toString() {
        return "Bremsen des Fahrrads: " + this.type;
    }
}
