package Strings.Level2;

import java.util.*;

public class q6 {
    public static String checkCharType(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32);  
        }
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }

    public static String[][] analyzeString(String s) {
        int n = 0;
        try {
            while (true) {
                s.charAt(n);
                n++;
            }
        } catch (Exception e) { }

        String[][] table = new String[n][2];
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            table[i][0] = String.valueOf(ch);
            table[i][1] = checkCharType(ch);
        }
        return table;
    }

    public static void displayTable(String[][] table) {
        System.out.println("Character\tType");
        for (String[] row : table) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[][] result = analyzeString(input);
        displayTable(result);
    }
}

