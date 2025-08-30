package Strings.Level2;

import java.util.*;

public class q7 {

    // Method to find start and end index after trimming spaces
    public static int[] findTrimPoints(String s) {
        int n = s.length();
        int start = 0, end = n - 1;

        // Leading spaces
        while (start < n && s.charAt(start) == ' ') {
            start++;
        }

        // Trailing spaces
        while (end >= 0 && s.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to create substring using charAt()
    public static String mySubstring(String s, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += s.charAt(i);
        }
        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean myEquals(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string with spaces: ");
        String input = sc.nextLine();

        int[] points = findTrimPoints(input);

        String trimmedCustom = "";
        if (points[0] <= points[1]) {
            trimmedCustom = mySubstring(input, points[0], points[1]);
        }

        String trimmedBuiltIn = input.trim();

        System.out.println("Custom Trimmed String: [" + trimmedCustom + "]");
        System.out.println("Built-in Trimmed String: [" + trimmedBuiltIn + "]");
        System.out.println("Both Equal? " + myEquals(trimmedCustom, trimmedBuiltIn));
    }
}

