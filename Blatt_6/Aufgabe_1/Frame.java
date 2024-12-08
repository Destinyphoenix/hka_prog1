package Aufgabe_1;

public class Frame extends Bike {
    private String name;
    private String type;

    public Frame(String name, String type, String componentName) {
        super(name);

        this.name = componentName;
        this.type = type;
        if(type == "") {
            this.type = "n.A.";
        }
    }

    public String toString() {
        return "Rahmen des Fahrrads: " + this.type;
    }
}
