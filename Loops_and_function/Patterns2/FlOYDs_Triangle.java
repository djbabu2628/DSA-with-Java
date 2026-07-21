import java.util.*;

public class FlOYDs_Triangle{
    public static void Triangle(int n){
        int count=1;
        for(int row=1;row<=n;row++){
            for(int num=1;num<=row;num++){
                System.out.print(" " + count);
                count++;
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        Triangle(n);
        sc.close();
    }
}