package Aufgabe_1;

public class Bike {
    //Attribute
    private String name;
    private String frameColor;
    private String frameMaterial;
    private String brakes;
    private String gearShift;

    //Construktor
    public Bike(String name, String frameColor, String frameMaterial, String brakes, String gearShift) {
        this.name = name;
        this.frameColor = frameColor;
        this.frameMaterial = frameMaterial;
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

    public String getFrameColor() {
        return this.frameColor;
    }

    public String getFrameMaterial() {
        return this.frameMaterial;
    }

    public String getBrakes() {
        return this.brakes;
    }

    public String getGearShift() {
        return this.gearShift;
    }



    public String toString() {
        return "Name des Fahrrads: " + this.name
                + "\nRahmenfarbe: " + this.frameColor
                + "\nRahmenmaterial: " + this.frameMaterial
                + "\nBremsen: " + this.brakes
                + "\nSchaltung: " + this.gearShift;
    }
}
