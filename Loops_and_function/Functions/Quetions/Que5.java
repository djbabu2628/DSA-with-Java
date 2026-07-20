import java.util.*;

public class Que5{
    public static int sum(int n){
        int sum = 0;
        while(n > 0){
            int LastD = n % 10;
            sum += LastD;
            n = n/10;
        }
        return sum;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        int sum = sum(n);
        System.out.print("Sum of these no. is : " + sum);
        sc.close();
    }

}