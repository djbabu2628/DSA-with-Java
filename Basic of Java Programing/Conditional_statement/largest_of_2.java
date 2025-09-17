import java.util.*;

public class largest_of_2 {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter A: ");
        int A = sc.nextInt();
        System.out.println("Enter B: ");
        int B = sc.nextInt();
        if(A>B){
            System.out.println("A is largest");
        }
        else{
            System.out.println("B is largest");
        }
        sc.close();
    }
}
