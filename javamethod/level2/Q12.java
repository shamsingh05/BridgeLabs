package javamethod.level2;

public class Q12 {
	public static int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = 1000 + (int)(Math.random() * 9000);
        }
        return numbers;
    }
    
    public static double[] findAverageMinMax(int[] numbers) {
        if (numbers.length == 0) {
            return new double[0];
        }
        
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;
        
        for (int number : numbers) {
            min = Math.min(min, number);
            max = Math.max(max, number);
            sum += number;
        }
        
        double average = (double) sum / numbers.length;
        
        return new double[]{average, min, max};
    }
    
    public static void main(String[] args) {
        System.out.println("4-Digit Random Number Generator");
        
        int size = 5;
        int[] randomNumbers = generate4DigitRandomArray(size);
        
        System.out.println("Generated " + size + " random 4-digit numbers:");
        for (int i = 0; i < randomNumbers.length; i++) {
            System.out.println("Number " + (i + 1) + ": " + randomNumbers[i]);
        }
        
        double[] stats = findAverageMinMax(randomNumbers);
        
        System.out.println("\nStatistics:");
        System.out.println("Average: " + String.format("%.2f", stats[0]));
        System.out.println("Minimum: " + (int)stats[1]);
        System.out.println("Maximum: " + (int)stats[2]);
    }
}
