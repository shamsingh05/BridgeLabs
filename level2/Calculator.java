package corejava.level2;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float number1 = sc.nextFloat();
		float number2 = sc.nextInt();
		
		float add = number1+number2;
		float sub = number1-number2;
		float mul = number1*number2;
		float div = number1/number2;
		
		System.out.println(add);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
	}

}
