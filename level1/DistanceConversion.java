package corejava.level1;
import java.util.Scanner;

public class DistanceConversion {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = sc.nextDouble();

        double yards = distanceInFeet / 3.0;
        double miles = yards / 1760.0;

        System.out.println("The distance in feet is " + distanceInFeet + " which is " + yards + " yards and " + miles + " miles");
    }
}
