package corejava.level2;
import java.util.Scanner;

public class Division {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int q=a/b;
        int r=a%b;
        System.out.println("The Quotient is "+q+" and Remainder is "+r+" of two numbers "+a+" and "+b);
    }

}
