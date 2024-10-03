import java.util.Scanner;

public class ChangeCalcCApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome to the Change Calculator!");
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		while(choice.equalsIgnoreCase("y"))
		{
			System.out.print("\nEnter number of cents (0-99):");
			int coins = sc.nextInt();
			
			sc.nextLine();
			
			int quarters = coins/25;
			int qRemainder = coins%25;
			int dimes = qRemainder/10;
			int dRemainder = qRemainder%10;
			int nickles = dRemainder/5;
			int pennies = dRemainder%5;
			
			System.out.println("\nQuarters:\t"+quarters);
			System.out.println("Dimes:\t\t"+dimes);
			System.out.println("Nickles:\t"+nickles);
			System.out.println("Pennies:\t"+pennies);
			
			System.out.print("\nContinue? (y/n): ");
			choice = sc.nextLine();
		}
	}

}
