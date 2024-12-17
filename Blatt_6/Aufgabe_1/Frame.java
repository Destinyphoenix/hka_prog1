package Blatt_6;

public class Frame {
    private String frameColor;
    private String frameMaterial;

    public Frame( String frameMaterial, String frameColor) {
        if (frameMaterial == "Alu") {
            this.frameMaterial = frameMaterial;
        } else if (frameMaterial == "Carbon") {
            this.frameMaterial = frameMaterial;
        } else {
            this.frameMaterial = "n.A.";
        }

        this.frameColor = frameColor;

    }

    public String toString() {
        return this.frameColor + "\n"
                + this.frameMaterial;
    }
}
