import java.util.*;

public class Que1{
    public int avg(int a, int b, int c){
        int avg = (a+b+c)/3;
        return avg;
    }

public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Your 1st no. ");
    int a = sc.nextInt();
    System.out.print("Enter Your 2nd no. ");
    int b = sc.nextInt();
    System.out.print("Enter Your 3rd no. ");
    int c = sc.nextInt();
    int avg=avg(a,b,c);
    System.out.println("Average of Your No. is " + avg);
    sc.close();
}
}