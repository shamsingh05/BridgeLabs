package javamethod.level2;
import java.util.Scanner;

public class Q7 {

	 public static boolean canStudentVote(int age) {
	        if (age < 0) {
	            return false; 
	        }
	        return age >= 18;
	    }
	    
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        
	        System.out.println("Student Voting Eligibility Checker");
	        
	        int[] studentAges = new int[10];
	        
	        for (int i = 0; i < 10; i++) {
	            System.out.print("Enter age for student " + (i + 1) + ": ");
	            studentAges[i] = input.nextInt();
	        }
	        
	        System.out.println("\nVoting Eligibility Results:");
	        System.out.println("Student\tAge\tCan Vote");
	        
	        for (int i = 0; i < 10; i++) {
	            boolean canVote = canStudentVote(studentAges[i]);
	            String voteStatus = canVote ? "Yes" : "No";
	            
	            System.out.println((i + 1) + "\t" + studentAges[i] + "\t" + voteStatus);
	        }
	        
	        input.close();
	    }

}
