package Aufgabe_1;

abstract class Bike {
    //Attribute
    private String name;
    private Frame frame;
    private Brakes brakes;
    private gearShift gearShift;

    //Construktor
    public Bike(String name, Frame frame, Brakes brakes, gearShift gearShift) {
        this.name = name;
        this.frame = frame;
        this.brakes = brakes;
        this.gearShift = gearShift;
    }

    //Methoden
    public String getName() {
        return this.name;
    }
    public void setName(String newName) {
        this.name = newName;
    }

    public String getFrame() {
        return frame.toString();
    }

    public String getBrakes() {
        return brakes.toString();
    }

    public String getGearShift() {
        return gearShift.toString();
    }



    public String toString() {
        return "Name des Fahrrads: " + this.name
                + "\nRahmenmaterial: " + this.frame
                + "\nBremsen: " + this.brakes
                + "\nSchaltung: " + this.gearShift;
    }
}
