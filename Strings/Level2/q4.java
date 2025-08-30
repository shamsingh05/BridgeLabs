package Strings.Level2;

import java.util.*;

public class q4 {
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

        String[] words = new String[spaceCount + 1];
        int start = 0, idx = 0;
        for (int i = 0; i <= n; i++) {
            if (i == n || s.charAt(i) == ' ') {
                StringBuilder word = new StringBuilder();
                for (int j = start; j < i; j++) {
                    word.append(s.charAt(j));
                }
                words[idx++] = word.toString();
                start = i + 1;
            }
        }
        return words;
    }

    public static String[][] wordsWithLength(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    public static int[] findShortestLongest(String[][] wordTable) {
        int minIndex = 0, maxIndex = 0;
        int minLen = Integer.parseInt(wordTable[0][1]);
        int maxLen = Integer.parseInt(wordTable[0][1]);

        for (int i = 1; i < wordTable.length; i++) {
            int len = Integer.parseInt(wordTable[i][1]);
            if (len < minLen) {
                minLen = len;
                minIndex = i;
            }
            if (len > maxLen) {
                maxLen = len;
                maxIndex = i;
            }
        }
        return new int[]{minIndex, maxIndex};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String[] words = customSplit(input);
        String[][] table = wordsWithLength(words);
        int[] result = findShortestLongest(table);

        System.out.println("Word\tLength");
        for (String[] row : table) {
            System.out.println(row[0] + "\t" + Integer.parseInt(row[1]));
        }

        System.out.println("\nShortest Word: " + table[result[0]][0] + " (" + table[result[0]][1] + ")");
        System.out.println("Longest Word: " + table[result[1]][0] + " (" + table[result[1]][1] + ")");
    }
}

