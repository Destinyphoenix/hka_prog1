package Aufgabe_1;

public class Type extends Bike{
    private String type;

    public Type(String name, String type) {
        super(name);

        this.type = type;
        if(type == "") {
            this.type = "n.A.";
        }
    }

    public String toString() {
        return "Typ des Fahrrads: " + this.type;
    }
}
