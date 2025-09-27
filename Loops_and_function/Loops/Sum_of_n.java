import java.util.*;


public class Sum_of_n {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n, sum = 0, i = 1;
        n = sc.nextInt();
        while(i<=n){
            sum += i;
            i++;
        }
        System.out.println(sum);
    }    
}
