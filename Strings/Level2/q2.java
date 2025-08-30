package Strings.Level2;

import java.util.*;

public class q2{
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

    public static String[] customSplit(String s) {
        int n = findLength(s);
        int spaceCount = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == ' ') spaceCount++;
        }

        int[] spaceIndexes = new int[spaceCount + 2];
        int idx = 0;
        spaceIndexes[idx++] = -1;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == ' ') {
                spaceIndexes[idx++] = i;
            }
        }
        spaceIndexes[idx] = n;

        String[] words = new String[spaceIndexes.length - 1];
        for (int i = 0; i < words.length; i++) {
            StringBuilder word = new StringBuilder();
            for (int j = spaceIndexes[i] + 1; j < spaceIndexes[i + 1]; j++) {
                word.append(s.charAt(j));
            }
            words[i] = word.toString();
        }
        return words;
    }

    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String[] customWords = customSplit(input);
        String[] builtInWords = input.split(" ");

        System.out.println("Custom Split: " + Arrays.toString(customWords));
        System.out.println("Built-in Split: " + Arrays.toString(builtInWords));
        System.out.println("Are they equal? " + compareArrays(customWords, builtInWords));
    }
}

