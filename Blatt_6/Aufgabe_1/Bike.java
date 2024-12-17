package Blatt_6.Aufgabe_1;

abstract class Bike {
    //Attribute
    private String name;
    private Frame frame;
    private Brake brake;
    private gearShift gearShift;

    //Construktor
    public Bike(String name, Frame frame, Brake brake, gearShift gearShift) {
        this.name = name;
        this.frame = frame;
        this.brake = brake;
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

    public String getBrake() {
        return brake.toString();
    }

    public String getGearShift() {
        return gearShift.toString();
    }



    public String toString() {
        return "Name des Fahrrads: " + this.name
                + "\nRahmenmaterial: " + this.frame
                + "\nBremsen: " + this.brake
                + "\nSchaltung: " + this.gearShift;
    }
}
