package corejava.level2;
import java.util.Scanner;

public class SideOfSquare {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        int s=p/4;
        System.out.println("The length of the side is "+s+" whose perimeter is "+p);
    }
}
