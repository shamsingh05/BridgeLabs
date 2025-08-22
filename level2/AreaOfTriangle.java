package corejava.level2;
import java.util.Scanner;

public class AreaOfTriangle {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double b=sc.nextInt();
        double h=sc.nextInt();
        double a=0.5*b*h;
        double a1=a/6.4516;
        System.out.println("The Area of the triangle in sq in is "+a+" and in sq cm is "+a1);
    }
}
