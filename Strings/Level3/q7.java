package Strings.Level3;

import java.util.*;

public class q7 {

    // Logic 1: Iterative check using start and end indexes
    public static boolean isPalindromeIterative(String s) {
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Recursive method
    public static boolean isPalindromeRecursive(String s, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(s, start + 1, end - 1);
    }

    // Helper: Reverse string using charAt()
    public static char[] reverseString(String s) {
        int n = s.length();
        char[] rev = new char[n];
        for (int i = 0; i < n; i++) {
            rev[i] = s.charAt(n - i - 1);
        }
        return rev;
    }

    // Logic 3: Using char arrays and reversed array
    public static boolean isPalindromeUsingArray(String s) {
        char[] original = s.toCharArray();
        char[] reversed = reverseString(s);

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        boolean result1 = isPalindromeIterative(text);
        boolean result2 = isPalindromeRecursive(text, 0, text.length() - 1);
        boolean result3 = isPalindromeUsingArray(text);

        System.out.println("\nPalindrome check results:");
        System.out.println("Logic 1 (Iterative) : " + (result1 ? "Palindrome" : "Not Palindrome"));
        System.out.println("Logic 2 (Recursive) : " + (result2 ? "Palindrome" : "Not Palindrome"));
        System.out.println("Logic 3 (Array)     : " + (result3 ? "Palindrome" : "Not Palindrome"));

        sc.close();
    }
}

    

