package javamethod.level1;
import java.util.*;
public class Q11 {
	public double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);
        return new double[]{sine, cosine, tangent};
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Q11 calc = new Q11();
        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();
        double[] results = calc.calculateTrigonometricFunctions(angle);
        System.out.println("\nTrigonometric values for angle " + angle + "°:");
        System.out.println("Sine: " + results[0]);
        System.out.println("Cosine: " + results[1]);
        System.out.println("Tangent: " + results[2]);
	}

}
