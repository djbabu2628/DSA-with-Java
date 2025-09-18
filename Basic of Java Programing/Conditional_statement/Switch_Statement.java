import java.util.*;

public class Switch_Statement {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        switch (num) {
            case 1: System.out.println("samosa");
                break;
            
            case 2: System.out.println("Khadda Kachori");
                break;

            case 3: System.out.println("Dahipuri");
                break;

            case 4: System.out.println("Gilla vada");
                break;
            default: System.out.println("Ghar ka khana");
        }
    }    
}
