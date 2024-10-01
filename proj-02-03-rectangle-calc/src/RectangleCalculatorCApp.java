import java.util.Scanner;

public class RectangleCalculatorCApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Area and Perimeter Calculator!");
		Scanner sc = new Scanner (System.in);
		String choice = "y";
		int len = 0;
		int wid = 0;
		double ar = 0;
		double peri = 0;
		
		while (choice.equalsIgnoreCase("y"))
		{
			System.out.print("\nEnter length:\t");
			len = sc.nextInt();
			
			System.out.print("Enter width:\t");
			wid = sc.nextInt();
			
			ar = len*wid;
			peri = (len+wid+len+wid);
			System.out.println("Area:\t\t" +ar);
			System.out.println("Perimeter:\t" +peri);
			
			System.out.print("\nContinue? (y/n) ");
			
			sc.nextLine();
			
			choice = sc.nextLine();
		}

		System.out.println("Thanks for using the Rectangle Calculator App!");
	}

}
