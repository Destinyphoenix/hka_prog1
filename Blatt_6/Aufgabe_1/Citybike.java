package Blatt_6.Aufgabe_1;

public class Citybike extends Bike{

    public Citybike(String name, Frame frame, Brake brakes, gearShift gearShift) {
        super(name, frame, brakes, gearShift);
    }

    public String toString() {
        return getName() + "\n"
                + getFrame() + "\n"
                + getBrakes() + "\n"
                + getGearShift() + "\n";
    }
}
