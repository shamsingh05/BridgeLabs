package Strings.Level3;
import java.util.*;

public class q4 {

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

    public static String[][] findFrequency(String s) {
        int[] freq = new int[256];
        int n = getLength(s);

        for (int i = 0; i < n; i++) {
            freq[s.charAt(i)]++;
        }

        String[][] result = new String[n][2];
        int index = 0;

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (freq[c] > 0) {
                result[index][0] = String.valueOf(c);
                result[index][1] = String.valueOf(freq[c]);
                freq[c] = 0;  
                index++;
            }
        }

        String[][] finalResult = new String[index][2];
        for (int i = 0; i < index; i++) {
            finalResult[i][0] = result[i][0];
            finalResult[i][1] = result[i][1];
        }
        return finalResult;
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
