package Blatt_6;

 abstract Brake  {

    private String brakeType;

    public Brakes(String brakeType) {
        this.brakeType = brakeType;
    }

    public String toString() {
        return this.brakeType;
    }
}
