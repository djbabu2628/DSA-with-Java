import java.util.*;

public class Inverted_HalfNum{
    public static void numPyramid(int n){
        for(int row=1;row<=n;row++){
            for(int num=1;num<=n-row+1;num++){
                System.out.print(num);
            }
            System.out.println();
        }

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        numPyramid(n);
        sc.close();

    }
}