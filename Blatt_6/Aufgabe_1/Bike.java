package Aufgabe_1;

public class Bike {
    private String name;

    public Bike(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String newName) {
        this.name = newName;
    }

    public String toString() {
        return "Name des Fahrrads: " + this.name;
    }
}
