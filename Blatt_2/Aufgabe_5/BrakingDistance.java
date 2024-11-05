import java.util.Scanner;

class BrakingDistance{
    public static void main(String[] args) {
        double v;
        Scanner scan = new Scanner(System.in);

        System.out.println("insert velocity in km/h");
            v = scan.nextDouble();

        System.out.println("current breaking distance is: "+ calculateBrakingDistance(v)+ "m");


    }
public static double calculateBrakingDistance(double v){
       return ((v/10.0)*(v/10.0));
        }
}
