package corejava.level2;
import java.util.Scanner;

public class DoubOpt {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextInt();
        double b=sc.nextInt();
        double c=sc.nextInt();
        
        double r1=a+b*c;
        double r2=a*b+c;
        double r3=c+a/b;
        double r4=a%b+c;
        System.out.println("The results of Int Operations are: " + r1 + ", " + r2 + ", " + r3 + ", " + r4);    
   }
}
