import java.util.*;

public class binTodec{
    public static void binTodec(int bin){
        int num = bin;
        int pow=0;
        int decNum=0;

        while(bin > 0){
            int lastD = bin%10;
            decNum = decNum + (lastD * (int)Math.pow(2,pow));

            pow++;
            bin = bin / 10;
        }
        System.out.println("Decimal of " + num + " = " + decNum);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Binary No. = ");
        int n = sc.nextInt();
        binTodec(n);
    }
}