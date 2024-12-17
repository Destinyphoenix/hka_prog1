package Blatt_6.Aufgabe_1;

public class Racingbike extends Bike{

    public Racingbike(String name, Frame frame, Brakes brakes, gearShift gearShift) {
        super(name, frame, brakes, gearShift);
    }

    public String toString() {
        return getName() + "\n"
                + getFrame() + "\n"
                + getBrakes() + "\n"
                + getGearShift() + "\n";
    }
}
