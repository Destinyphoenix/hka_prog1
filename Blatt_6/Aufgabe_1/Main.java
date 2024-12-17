package Blatt_6;



class Main {

    public static void main(String[] args) {
        Bike Fahrrad_1 = new Racingbike(
            "Fahrrad_1",
            new Frame("Carbon", "rot"),
            new Felgenbremse("Felgenbremsen"),
            new gearShift("Kettenschaltung")
        );
        Bike Fahrrad_2 = new EMountainbike(
            "Fahrrad_2",
            new Frame("Alu", "schwarz"),
            new Scheibenbremse("Scheibenbremsen"),
            new gearShift("Kettenschaltung")
        );
        Bike Fahrrad_3 = new ECitybike(
            "Fahrrad_3",
            new Frame("Alu", "weiß"),
            new Brakes("Trommelbremsen"),
            new gearShift("Nabenschaltung")
        );

        System.out.println(Fahrrad_1);
        System.out.println(Fahrrad_2);
        System.out.println(Fahrrad_3);

        //nur zum Zeigen vom Setter
        Fahrrad_1.setName("erstes Fahrrad");
        System.out.println(Fahrrad_1);
    }
}
