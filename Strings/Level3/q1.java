package Strings.Level3;

import java.util.*;

public class q1 {

    // Method to compute BMI and status
    public static String[] computeBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0;
        double bmi = weight / (heightM * heightM);

        String status;
        if (bmi < 18.5)
            status = "Underweight";
        else if (bmi < 24.9)
            status = "Normal";
        else if (bmi < 29.9)
            status = "Overweight";
        else
            status = "Obese";

        return new String[]{
                String.format("%.2f", heightCm),
                String.format("%.2f", weight),
                String.format("%.2f", bmi),
                status
        };
    }

    // Method that takes the 2D array of height and weight and returns 2D String array
    public static String[][] processBMI(double[][] arr) {
        String[][] result = new String[arr.length][4];

        for (int i = 0; i < arr.length; i++) {
            result[i] = computeBMI(arr[i][0], arr[i][1]);
        }
        return result;
    }

    // Method to display the table
    public static void display(String[][] data) {
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Height(cm)", "Weight(kg)", "BMI", "Status");
        System.out.println("------------------------------------------------------");

        for (String[] row : data) {
            System.out.printf("%-10s %-10s %-10s %-15s\n", row[0], row[1], row[2], row[3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] arr = new double[10][2]; // [weight, height]

        System.out.println("Enter weight(kg) and height(cm) for 10 persons:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Person " + (i + 1) + " - Weight(kg): ");
            arr[i][0] = sc.nextDouble();
            System.out.print("Person " + (i + 1) + " - Height(cm): ");
            arr[i][1] = sc.nextDouble();
        }

        String[][] result = processBMI(arr);
        display(result);

        sc.close();
    }
}
