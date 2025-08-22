package corejava.level2;
import java.util.Scanner;

public class FindTheDistance {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int f=sc.nextInt();
        int y=f/3;
        int m=f/1760;
        System.out.println("The distance in yards is "+y+" while the distance in miles is "+m);
    }

}
