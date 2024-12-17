package Blatt_6;

public class ECitybike extends Citybike{
    public ECitybike(String name, Frame frame, Brakes brakes, gearShift gearShift) {
        super(name, frame, brakes, gearShift);
    }

    public String toString() {
        return getName() + "\n"
                + getFrame() + "\n"
                + getBrakes() + "\n"
                + getGearShift() + "\n";
    }
}
