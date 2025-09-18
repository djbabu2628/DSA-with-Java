import java.util.*;


public class print_1ton {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no.");
        int n = sc.nextInt(), count = 0;
        while(count <= n){
            System.out.println(count);
            count++;
        }
    }    
}
