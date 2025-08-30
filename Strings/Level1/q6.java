import java.util.*;

public class q6 {
    public static void generateException(String text) {
        System.out.println(text.substring(5, 2)); 
    }

    public static void handleException(String text) {
        try {
            System.out.println(text.substring(5, 2)); 
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: " + e);
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        // This will throw exception
        // generateException(text);

        // This will handle exception
        handleException(text);
    }
}
