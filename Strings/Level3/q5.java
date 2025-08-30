package Strings.Level3;

import java.util.*;

public class q5 {

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

    public static char[] uniqueCharacters(String s) {
        int n = getLength(s);
        char[] temp = new char[n];
        int uniqueCount = 0;

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (s.charAt(j) == c) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                temp[uniqueCount++] = c;
            }
        }

        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = temp[i];
        }
        return result;
    }

    public static String[][] findFrequency(String s) {
        int[] freq = new int[256];
        int n = getLength(s);

        for (int i = 0; i < n; i++) {
            freq[s.charAt(i)]++;
        }

        char[] unique = uniqueCharacters(s);
        String[][] result = new String[unique.length][2];

        for (int i = 0; i < unique.length; i++) {
            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(freq[unique[i]]);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[][] freqArray = findFrequency(text);

        System.out.println("Character  Frequency");
        System.out.println("--------------------");
        for (String[] row : freqArray) {
            System.out.printf("%-10s %s\n", row[0], row[1]);
        }

        sc.close();
    }
}

