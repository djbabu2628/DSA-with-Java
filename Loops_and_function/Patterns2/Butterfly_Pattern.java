import java.util.*;

public class Butterfly_Pattern{
    public static void butter(int n){
        for(int row=1;row<=n;row++){
            for(int star=1;star<row;star++){
                System.out.print("*");
            }

            for(int space=1;space<=2*(n-row);space++){
                System.out.print(" ");
            }

            for(int star=1;star<row;star++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int row=n;row>=1;row--){
            for(int star=1;star<row;star++){
                System.out.print("*");
            }

            for(int space=1;space<=2*(n-row);space++){
                System.out.print(" ");
            }

            for(int star=1;star<row;star++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        butter(n);
        sc.close();
    }
}