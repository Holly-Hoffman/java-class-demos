import java.text.NumberFormat;
import java.util.Scanner;

public class InterestCalcCApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome to the Interest Calculator!");
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		
		while(choice.equalsIgnoreCase("y"))
		{
			System.out.print("\nEnter loan amount:\t");
			double loan = sc.nextDouble();
			
			sc.nextLine();
			
			System.out.print("Enter interest rate:\t");
			double interest = sc.nextDouble();
			
			sc.nextLine();
			
			double totLoan = loan + (loan*interest);
			double totInt = loan*interest;
			NumberFormat cashFormat = NumberFormat.getCurrencyInstance();
			
			System.out.println("\nLoan amount:\t\t"+cashFormat.format(totLoan));
			NumberFormat pctFormatter = NumberFormat.getPercentInstance();
			pctFormatter.setMaximumFractionDigits(3);
			System.out.println("Interest rate:\t\t"+pctFormatter.format(interest));
			System.out.println("Interest:\t\t"+cashFormat.format(totInt));
			
			System.out.print("\nContinue? (y/n): ");
			choice = sc.nextLine();
			
		}
	}

}
