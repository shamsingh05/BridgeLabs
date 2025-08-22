package corejava.level1;
import java.util.Scanner;

public class AreaOfTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter the base of the triangle (in inches):");
        double baseInInches = sc.nextDouble();

        System.out.println("Enter the height of the triangle (in inches):");
        double heightInInches = sc.nextDouble();

        double areaInSquareInches = 0.5 * baseInInches * heightInInches;

        final double INCH_TO_CM = 2.54;
        final double SQUARE_INCH_TO_SQUARE_CM = INCH_TO_CM * INCH_TO_CM;

        double areaInSquareCentimeters = areaInSquareInches * SQUARE_INCH_TO_SQUARE_CM;

        System.out.println("\n--- Triangle Area Results ---");
        System.out.printf("Area: %.2f square inches%n", areaInSquareInches);
        System.out.printf("Area: %.2f square centimeters%n", areaInSquareCentimeters);

        
	}
}
