import java.util.*;

public class Sum{

    public static int Calculate_Sum(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value 1st value : ");
        int a = sc.nextInt();
        System.out.print("Enter value 2nd value : ");
        int b = sc.nextInt();
        int sum = Calculate_Sum(a,b);
        System.out.println("Sum = " + sum);
    }
}