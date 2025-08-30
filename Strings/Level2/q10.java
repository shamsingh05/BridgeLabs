package Strings.Level2;
import java.util.*;

public class q10 {

    // Method to generate random scores for n students in PCM
    public static int[][] generateScores(int n) {
        int[][] scores = new int[n][3]; // PCM
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = rand.nextInt(41) + 60; // random 2-digit scores (60-100 for realism)
            }
        }
        return scores;
    }

    // Method to calculate total, average, percentage
    public static double[][] calculateResults(int[][] scores) {
        int n = scores.length;
        double[][] results = new double[n][3]; // total, average, percentage
        for (int i = 0; i < n; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double perc = (total / 300.0) * 100.0;
            results[i][0] = total;
            results[i][1] = Math.round(avg * 100.0) / 100.0;
            results[i][2] = Math.round(perc * 100.0) / 100.0;
        }
        return results;
    }

    // Method to assign grade
    public static String[] assignGrades(double[][] results) {
        int n = results.length;
        String[] grades = new String[n];
        for (int i = 0; i < n; i++) {
            double perc = results[i][2];
            if (perc >= 80) grades[i] = "A";
            else if (perc >= 70) grades[i] = "B";
            else if (perc >= 60) grades[i] = "C";
            else if (perc >= 50) grades[i] = "D";
            else if (perc >= 40) grades[i] = "E";
            else grades[i] = "R";
        }
        return grades;
    }

    // Method to display scorecard
    public static void displayScorecard(int[][] scores, double[][] results, String[] grades) {
        System.out.println("ID   Physics   Chemistry   Math   Total   Average   %age   Grade");
        System.out.println("-----------------------------------------------------------------");
        for (int i = 0; i < scores.length; i++) {
            System.out.println((i+1) + "    " + scores[i][0] + "        " + scores[i][1] + "         " + scores[i][2] +
                    "      " + (int)results[i][0] + "      " + results[i][1] + "     " + results[i][2] + "    " + grades[i]);
        }
    }

    // Main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] scores = generateScores(n);
        double[][] results = calculateResults(scores);
        String[] grades = assignGrades(results);

        displayScorecard(scores, results, grades);
    }
}
