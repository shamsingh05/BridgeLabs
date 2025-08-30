import java.util.*;

public class q7 {
    public static void generateException(String text) {
        int num = Integer.parseInt(text); 
        System.out.println("Converted number: " + num);
    }

    public static void handleException(String text) {
        try {
            int num = Integer.parseInt(text); 
            System.out.println("Converted number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e);
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        // This will throw the exception
        // generateException(text);

        // This will handle the exception
        handleException(text);
    }
}
