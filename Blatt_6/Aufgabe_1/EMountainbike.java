package Blatt_6.Aufgabe_1;

public class EMountainbike extends Mountainbike{
    public EMountainbike(String name, Frame frame, Brake Brake, gearShift gearShift) {
        super(name, frame, Brake, gearShift);
    }

    public String toString() {
        return getName() + "\n"
                + getFrame() + "\n"
                + getBrake() + "\n"
                + getGearShift() + "\n";
    }
}
