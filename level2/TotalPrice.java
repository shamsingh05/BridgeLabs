package corejava.level2;
import java.util.Scanner;

public class TotalPrice {
	 public static void main(String[] args) {
	     Scanner sc=new Scanner(System.in);
	     int unit=sc.nextInt();
	     int quan=sc.nextInt();
	     int total=quan*unit;
	     System.out.println("The total purchase price is INR "+total+" if the quantity "+quan+" and unit price is INR "+unit);
	 }
}
