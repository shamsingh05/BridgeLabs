public class q4 {
    public static void generateException() {
        String text = null;
        System.out.println(text.length()); 
    }

    public static void handleException() {
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e);
        }
    }

    public static void main(String[] args) {
        // First will throw NullPointerException
        // generateException();

        // After refactoring, handle the exception
        handleException();
    }
}
