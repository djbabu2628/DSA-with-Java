import java.util.*;

public class Que3{
    public static void Palindrome(int num){
        int original = num;
        int reverse = 0;
        while(num > 0){
            int LastDigt = num%10;
            reverse = (reverse * 10) + LastDigt;
            num = num / 10;
        }
        if(original == reverse){
            System.out.print("Your Num is Palindrome : " + reverse);
        }
        else{
            System.out.print("Your Num is Not Palindrome : " + reverse);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();
        Palindrome(num);
        sc.close();

    }
}