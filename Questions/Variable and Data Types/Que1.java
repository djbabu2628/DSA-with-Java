import java.util.*;
public class Que1 {
    //Question1 : In a program, input 3 numbers : A, B and C. You have to output the average of these 3 numbers.
    //(Hint : Average of N numbers is sum of those numbers divided by N)
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st no. :");
        int A = sc.nextInt();
        System.out.println("Enter 2nd no. :");
        int B = sc.nextInt();
        System.out.println("Enter 3rd no. :");
        int C = sc.nextInt();
        int avg = (A+B+C)/3;
        System.out.println("Average of A B C is " + avg);
        sc.close();
    }
}
