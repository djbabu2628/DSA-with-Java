import java.util.*;

public class Triangle_01{
    public static void Triangle(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                if((row+col)%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        Triangle(n);
        sc.close();
    }
}