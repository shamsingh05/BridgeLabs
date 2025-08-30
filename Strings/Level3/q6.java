package Strings.Level3;

import java.util.*;

public class q6 {

    public static String[] findFrequency(String s) {
        char[] chars = s.toCharArray();
        int n = chars.length;
        int[] freq = new int[n];

        for (int i = 0; i < n; i++) {
            freq[i] = 1;
            if (chars[i] == '0') continue;

            for (int j = i + 1; j < n; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0'; 
                }
            }
        }

        String[] result = new String[n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (chars[i] != '0') {
                result[index++] = chars[i] + " : " + freq[i];
            }
        }

        return Arrays.copyOf(result, index);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[] freqArray = findFrequency(text);

        System.out.println("Character  Frequency");
        System.out.println("--------------------");
        for (String row : freqArray) {
            System.out.println(row);
        }

        sc.close();
    }
}

