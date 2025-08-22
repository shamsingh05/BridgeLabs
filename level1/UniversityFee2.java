package corejava.level1;
import java.util.Scanner;

public class UniversityFee2 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Student Fee (INR): ");
        double fee = sc.nextDouble();

        System.out.print("Enter the Discount Percent: ");
        double discountPercent = sc.nextDouble();

        double discount = (fee * discountPercent) / 100;
        double finalFee = fee - discount;

        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
	}
}
