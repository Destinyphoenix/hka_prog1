package Aufgabe_1;

public class Citybike extends Bike{
    private boolean e_Version;

    public Citybike(String name, String frameColor, String frameMaterial, String brakes, String gearShift, boolean e_Version) {
        super(name, frameColor, frameMaterial, brakes, gearShift);
        this.e_Version = e_Version;
    }

    public String toString() {
        return getName() + "\n"
                + getFrameColor() + "\n"
                + getFrameMaterial() + "\n"
                + getBrakes() + "\n"
                + getGearShift() + "\n"
                + "E-Bike?: " + this.e_Version + "\n";
    }
}
