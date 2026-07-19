import java.util.*;

public class Bionomial_C{
    public static int Fact(int n){
        int fact = 1;
        for(int i = 1;i<=n;i++){
            fact = fact * i;
        }
        return fact;
    }

    public static int Bio_nCr(int n, int r){
        int n_fact = Fact(n);
        int r_fact = Fact(r);
        int nr_fact = Fact(n-r);

        return (n_fact/(r_fact*(nr_fact)));
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        System.out.print("Enter the value of r : ");
        int r = sc.nextInt();

        int bio = Bio_nCr(n,r);
        System.out.print("nCr = " + bio);
   }
}