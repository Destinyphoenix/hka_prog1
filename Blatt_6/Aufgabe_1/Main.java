package Aufgabe_1;

class Main {
    public static void main(String[] args) {
        Bike Fahrrad_1 = new Racingbike("Fahrrad_1", "rot", "Carbon", "Felgenbremsen", "Kettenschaltung");
        Bike Fahrrad_2 = new Mountainbike("Fahrrad_2", "schwarz", "Alu", "Scheibenbremsen", "Kettenschaltung", true);
        Bike Fahrrad_3 = new Citybike("Fahrrad_3", "weiß", "Alu", "Trommelbremsen", "Nabenschaltung", true);

        System.out.println(Fahrrad_1);
        System.out.println(Fahrrad_2);
        System.out.println(Fahrrad_3);
    }
}

