import java.util.Scanner;

public class Babku{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double grill;
        Halloumi h = new Halloumi();
        double maxHalloumiOnGrill;

        final int childCost = 1;
        final int adultCost = 2;
        int children;
        int adults;

        System.out.println("insert grill diameter in cm");
        grill = scan.nextDouble();

        System.out.println("insert Halloumi length in cm");
        h.setLength(scan.nextDouble());
        System.out.println("insert Halloumi width in cm");
        h.setWidth(scan.nextDouble());

        maxHalloumiOnGrill = maxHalloumi(grill, h);
        System.out.println("there can be a maximum of "+maxHalloumiOnGrill+" Halloumi on the grill at the same time");
        System.out.println("how many children are present?");
        children = scan.nextInt();
        System.out.println("how many adults are present?");
        adults = scan.nextInt();

        System.out.println("the grill needs "+ neededGrillFillings(maxHalloumiOnGrill, adults*adultCost+children*childCost)+" refills to serve all participants");

    }
    public static double maxHalloumi(double d, Halloumi h){
        return ((Math.PI* Math.pow((d/2.0),2))/(h.width*h.length));
    }
    public static int neededGrillFillings(double hMaxPerServe, int neededH){
        return (int)(Math.floor(neededH /hMaxPerServe)); //runden
    }
}

 class Halloumi{
    double width;
    double length;

    public void setWidth(double width){
        this.width = width;
    }
    public void setLength(double length){
        this.length = length;
    }
}
