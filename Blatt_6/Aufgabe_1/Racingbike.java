package Aufgabe_1;

public class Racingbike extends Bike{

    public Racingbike(String name, String frameColor, String frameMaterial, String brakes, String gearShift) {
        super(name, frameColor, frameMaterial, brakes, gearShift);
    }

    public String toString() {
        return getName() + "\n"
                + getFrameColor() + "\n"
                + getFrameMaterial() + "\n"
                + getBrakes() + "\n"
                + getGearShift() + "\n";
    }
}
