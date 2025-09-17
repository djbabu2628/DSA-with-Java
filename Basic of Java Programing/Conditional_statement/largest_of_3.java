import java.util.*;

public class largest_of_3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A:");
        int A = sc.nextInt();
        System.out.println("Enter B:");
        int B = sc.nextInt();
        System.out.println("Enter C:");
        int C = sc.nextInt();

        if(A>=B && A>=C){
            System.out.println("A is largest");
        }
        else if(B>=C){
            System.out.println("B is largest");
        }
        else {
            System.out.println("C is largest");
        }
    }    
}
