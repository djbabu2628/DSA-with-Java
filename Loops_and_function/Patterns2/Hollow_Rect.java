import java.util.*;

public class Hollow_Rect{

    public static void Rect(int rows, int cols){
        for(int i=1;i<= rows;i++){
            for(int j=1;j<=cols;j++){
                if(i == 1|| i==rows || j==1 || j==cols){
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
        System.out.print("Enter length : ");
        int cols = sc.nextInt();
        System.out.print("Enter width : ");
        int rows = sc.nextInt();
        Rect(rows,cols);
        sc.close();
    }
}