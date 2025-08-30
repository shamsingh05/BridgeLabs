import java.util.*;

public class q2 {
    public static String makeSubstring(String s, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += s.charAt(i);
        }
        return result;
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();

        String manual = makeSubstring(text, start, end);
        String builtin = text.substring(start, end);

        System.out.println("Substring using charAt: " + manual);
        System.out.println("Substring using substring(): " + builtin);

        boolean result = compareStrings(manual, builtin);
        if (result) {
            System.out.println("Both substrings are the same");
        } else {
            System.out.println("Both substrings are different");
        }
    }
}
