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
    int ergI = (int)((v/10)*(v/10));
    double ergD = (double)((v/10)*(v/10));
    float ergF = (float)((v/10)*(v/10));
    byte ergB = (byte)((v/10)*(v/10));
     System.out.println("int: "+ergI+ " d "+ergD+" f: "+ergF+" b: "+ergB);
        return ((v/10)*(v/10));
        }
}
