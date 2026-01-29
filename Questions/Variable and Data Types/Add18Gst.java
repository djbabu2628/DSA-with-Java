import java.util.*;

public class Add18Gst {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the price of pencil: ");
        float pencil = sc.nextFloat();
        System.out.print("Enter the price of pen: ");
        float pen = sc.nextFloat();
        System.out.print("Enter the price of eraser: ");
        float eraser = sc.nextFloat();
        float total = pencil + pen + eraser;
        float finalAmount = total + (total * 0.18f);
        System.out.println("The final amount with GST is: " + finalAmount);
        sc.close();
    }
}