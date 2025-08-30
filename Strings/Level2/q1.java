package Strings.Level2;
import java.util.*;

public class q1 {
    public static int findLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();
        System.out.println("Length using user-defined method: " + findLength(input));
        System.out.println("Length using built-in method: " + input.length());
    }
}
