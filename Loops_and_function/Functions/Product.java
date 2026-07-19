import java.util.*;

public class Product{
    public static int ProductOf2(int num1,int num2){
        int product = num1 * num2;
        return product;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of first number : ");
        int a = sc.nextInt();
        System.out.print("Enter the value of second number : ");
        int b = sc.nextInt();
        int product = ProductOf2(a,b);
        System.out.print("Product = " + product);
    }

}