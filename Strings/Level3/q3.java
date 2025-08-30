package Strings.Level3;

import java.util.*;

public class q3 {

    public static int getLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }

    public static char firstNonRepeatingChar(String s) {
        int[] freq = new int[256];
        int n = getLength(s);

        for (int i = 0; i < n; i++) {
            freq[s.charAt(i)]++;
        }

        for (int i = 0; i < n; i++) {
            if (freq[s.charAt(i)] == 1) {
                return s.charAt(i);
            }
        }
        return '\0';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        char result = firstNonRepeatingChar(text);

        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }

        sc.close();
    }
}

