package javamethod.level2;
import java.util.Scanner;

public class Q8 {

	public static int findYoungest(int[] ages) {
        int youngest = ages[0];
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < youngest) {
                youngest = ages[i];
            }
        }
        return youngest;
    }
    
    public static double findTallest(double[] heights) {
        double tallest = heights[0];
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > tallest) {
                tallest = heights[i];
            }
        }
        return tallest;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Friends Comparison - Youngest and Tallest");
        
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];
        
        for (int i = 0; i < 3; i++) {
            System.out.println("\nEnter data for " + names[i] + ":");
            System.out.print("Age: ");
            ages[i] = input.nextInt();
            
            System.out.print("Height (in cm): ");
            heights[i] = input.nextDouble();
        }
        
        int youngestAge = findYoungest(ages);
        double tallestHeight = findTallest(heights);
        
        System.out.println("\nResults:");
        System.out.println("Youngest friend age: " + youngestAge + " years");
        System.out.println("Tallest friend height: " + tallestHeight + " cm");
        
        System.out.println("\nAll Friends Data:");
        System.out.println("Name\t\tAge\tHeight(cm)");
        for (int i = 0; i < 3; i++) {
            System.out.println(names[i] + "\t\t" + ages[i] + "\t" + heights[i]);
        }
        
    }

}
