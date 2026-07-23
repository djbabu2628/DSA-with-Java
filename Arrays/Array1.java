import java.util.*;

public class Array1{
    public static void update(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String args[]){
        int arr[] = new int[30];
        int marks[] = {97,88,90,78};
        update(marks);
        for(int i=0;i<marks.length;i++){
            System.out.println("marks :"+marks[i]);
        }

        Scanner sc = new Scanner(System.in);
        // arr[0] = sc.nextInt();
        // arr[1] = sc.nextInt();
        // arr[2] = sc.nextInt();
        // arr[3] = sc.nextInt();
        // System.out.println("Phy : "+arr[0]);
        // System.out.println("Chem : "+arr[1]);
        // System.out.println("Math : "+arr[2]);
        // System.out.println("Bio : "+arr[3]);

        // int percentage = (arr[0]+ arr[1]+arr[2]+arr[3])/4;
        // System.out.println("percentage "+percentage+"%");

        System.out.println("Length of Arrays : "+arr.length);


    }
}