import java.util.*;

public class Prime_No1{

    public static boolean isPrime(int n){
        boolean isPrime = true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%2==0){
                isPrime=false;
                break;
            }
        }
        return isPrime;
    }

    public static void PrimeInRange(int n){
        for(int i = 2;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number ");
        int n = sc.nextInt();
        // if(n<=1){
        //     System.out.print("less than 1 is not prime no. please enter greater than 1");
        // }
        // else{
        //     System.out.print("is Prime " + isPrime(n));
        // }
        PrimeInRange(n);
    }

}