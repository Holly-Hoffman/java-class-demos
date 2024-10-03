import java.util.Scanner;

public class TravelTimeCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome to the Travel Time Calculator!");
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		
		while(choice.equalsIgnoreCase("y"))
		{
			System.out.print("\nEnter miles:\t\t");
			double miles = sc.nextDouble();
			
			sc.nextLine();
			
			System.out.print("Enter miles per hour:\t");
			double mph = sc.nextDouble();
			
			sc.nextLine();
			
			System.out.println("Estimated travel time");
			System.out.println("---------------------");
			int h = (int) ((miles/mph)/60);
			int m = (int) ((miles/mph)%60);
			System.out.println("Hours:\t\t"+h);
			System.out.println("Minutes:\t"+m);
			
			System.out.print("Continue? (y/n) ");
			choice = sc.nextLine(); 
			
		}
		
		
	}

}
