import java.util.*;

public class Student {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Marks: ");
        int marks = sc.nextInt();

        String report = (marks >= 35) ? "PASS" : "FAIL";
        System.out.println(report);
    }    
}
