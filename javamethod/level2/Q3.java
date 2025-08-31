package javamethod.level2;
import java.util.*;

public class Q3 {

	public static boolean isLeapYear(int year) {
        if (year < 1582) {
            return false; 
        }
        
        
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Leap Year Checker");
        
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        
        if (year < 1582) {
            System.out.println("Year " + year + " is not a Leap Year");
            System.out.println("Note: Gregorian calendar started in 1582");
        } else {
            boolean isLeap = isLeapYear(year);
            
            if (isLeap) {
                System.out.println("Year " + year + " is a Leap Year");
            } else {
                System.out.println("Year " + year + " is not a Leap Year");
            }
        }
        
    }

}
