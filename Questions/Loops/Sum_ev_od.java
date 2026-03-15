import java.util.*;

class Sumofeo{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num;
		int choice;
		int even=0, odd=0;
		
		do{
			System.out.print("Enter the number ");
			num = sc.nextInt();

			if(num % 2 == 0){
				even+=num;
			}
			else{
				odd+=num;
			}
				System.out.print("Do you want to continue then press 1 if you want to stop this then press 0");
			choice = sc.nextInt();
		}while(choice == 1);
		
		System.out.println("Sum of even numbers: " + even);
		System.out.println("Sum of odd numbers: " +
odd);

	}
}