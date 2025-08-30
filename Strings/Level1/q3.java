import java.util.*;

public class q3 {
    public static char[] makeCharArray(String s) {
        char[] arr = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }
        return arr;
    }

    public static boolean compareArrays(char[] a, char[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        char[] manual = makeCharArray(text);
        char[] builtin = text.toCharArray();

        System.out.println("User-defined char array: " + Arrays.toString(manual));
        System.out.println("Built-in toCharArray: " + Arrays.toString(builtin));

        boolean result = compareArrays(manual, builtin);
        if (result) {
            System.out.println("Both arrays are the same");
        } else {
            System.out.println("Both arrays are different");
        }
    }
}
