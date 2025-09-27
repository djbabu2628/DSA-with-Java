import java.util.*;
import java.lang.ArithmeticException;

public class check_prime1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        if(n==2){
            System.out.println(n+" is Prime Number");
        }
        else{
            boolean isPrime = true;
            for(int i=2;i<Math.sqrt(n);i++){
                if(n%i==0){
                    isPrime = false;
                }
            }
            if(isPrime == true){
                System.out.println(n+" is Prime Number");
            }
            else{
                System.out.println(n+" is Not Prime Number");
            }
        }
        sc.close();
    }
}
