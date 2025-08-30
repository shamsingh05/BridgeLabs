import java.util.*;

public class q5 {
    public static void generateException(String text) {
        System.out.println("Character at invalid index: " + text.charAt(text.length())); 
    }

    public static void handleException(String text) {
        try {
            System.out.println("Character at invalid index: " + text.charAt(text.length())); 
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught: " + e);
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
