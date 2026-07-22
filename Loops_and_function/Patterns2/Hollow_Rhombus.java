import java.util.*;

public class Hollow_Rhombus{
    public static void Rhombus(int n){
        for(int row=1;row<=n;row++){
            for(int space=1;space<=n-row;space++){
                System.out.print(" ");
            }
            for(int star=1;star<=n;star++){
                if(row==1||row==n||star==1||star==n){
                    System.out.print("*");
                }
                else{
                System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        Rhombus(n);
        sc.close();
    }
}