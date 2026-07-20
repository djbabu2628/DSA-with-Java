import java.util.*;
public class decTobin{
    
public static void decTobin(int n){
    int bin = 0;
    int pow = 0;
    int decNum = n;

    while(n>0){
        int rem = n % 2;
        bin = bin + (rem * (int)(Math.pow(10,pow)));
        pow++;
        n = n / 2;
    }
    System.out.print("Binary of " + decNum + " is : " + bin);
    }

public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Decimal no : ");
        int n = sc.nextInt();
        decTobin(n);
        sc.close();

    }

}