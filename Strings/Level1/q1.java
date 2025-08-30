import java.util.*;
public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int n1 = s1.length();
        int n2 = s2.length();

        boolean isEqual = true;

        if(n1 != n2) isEqual = false;
        else{
            for(int i = 0 ; i < n1 ; i++){
                if(s1.charAt(i) != s2.charAt(i)){
                    isEqual = false;
                }
            }
        }
        
        boolean isEqual_Method = s1.equals(s2);

        if(isEqual == isEqual_Method){
            System.out.println("Both method return same output");
        }
        else{
            System.out.println("Both method return different same output");
        }
    }
}
