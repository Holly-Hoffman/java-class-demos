import java.util.Scanner;

public class TempConverterApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to the Temperature Converter!");
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		
		while(choice.equalsIgnoreCase("y"))
		{
			System.out.print("\nEnter degrees in Fahrenheit: ");
			double f = sc.nextDouble();
			double c = (f-32) * 5/9;
			System.out.println("Degrees in Celsius: " + c);
			
			sc.nextLine();
			System.out.print("\nContinue? (y/n): ");
			choice = sc.nextLine();
		}

	}

}
