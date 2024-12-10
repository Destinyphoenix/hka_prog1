package Blatt_6.Aufgabe_2;
import java.math.BigInteger;
import java.util.Scanner;

public class FacultyFunction {
    public static void main(String[] args) {
        System.out.println("Please enter your int number to calculate the faculty: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(calculateFaculty(number));
    }

    //methode to calculate the Faculty
    public static BigInteger calculateFaculty(int number) {

        //initializing faculty variable with a value of 1 because of the multiplication down below
        BigInteger faculty = BigInteger.valueOf((1));

        if (number == 0) {
            faculty = BigInteger.ONE;
        }
        if (number > 5000) {
            System.out.println(number + " is to big to calculate the faculty");
        }
        else {
            //faculty calculation
            while (number > 0) {
                faculty = faculty.multiply(BigInteger.valueOf(number));
                number--;
            }
        }
        return faculty;
    }
}