import java.util.*;

public class Inverted_HalfPyramid{
    public static void pyramid(int n){
        for(int row=1;row<=n;row++){
            for(int space=1;space<=n-row;space++){
                System.out.print(" ");
            }
            for(int star=1;star<=row;star++){
                System.out.print("*");
                }
            System.out.println("");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        pyramid(n);
        sc.close();
    }
}