import java.util.*;

public class Que2{
    public static boolean isEven(int n){
        if(n%2==0){
            return true;
        }
        else return false;
    }

public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a Number: ");
    int n = sc.nextInt();
    System.out.print("Your Number is Even : " + isEven(n));
    sc.close();
}

}