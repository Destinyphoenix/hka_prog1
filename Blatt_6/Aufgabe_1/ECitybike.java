package Blatt_6.Aufgabe_1;

public class ECitybike extends Citybike{
    public ECitybike(String name, Frame frame, Brake Brake, gearShift gearShift) {
        super(name, frame, Brake, gearShift);
    }

    public String toString() {
        return getName() + "\n"
                + getFrame() + "\n"
                + getBrake() + "\n"
                + getGearShift() + "\n";
    }
}
