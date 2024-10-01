import java.text.NumberFormat;

public class MathAppDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("START!");
		//pg 101
		double result = 1.667;
		
		result = Math.round(result);
		System.out.println(result);
		
		double x = 10.315;
		x = (double)Math.round(x*100) /100;
		System.out.println(x);
		
		double y = 10.315;
		y = (double)Math.round(y*10) /10;
		System.out.println(y);
		
		//5 to the power of 4
		double sqrd = Math.pow(5, 4);
		System.out.println(sqrd);
		
		//square root
		double sqrt = Math.sqrt(20.25);
		System.out.println(sqrt);
		
		//max and min
		int big = 67;
		int lil = 23;
		System.out.println(Math.max(big, lil));
		System.out.println(Math.min(big, lil));
		
		//random number
 for (int i=0; i <10; i++)
 {
	 int dieRoll = (int)(Math.random() *6) + 1;
	 System.out.println(dieRoll);
 }
 
 
 //currency formatting - pg 103
 double pricing = 11.575;
 NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
 System.out.println(currencyFormatter.format(pricing));
 
 //percent instead
 double interestRate = .0788236;
 NumberFormat pctFormatter = NumberFormat.getPercentInstance();
 pctFormatter.setMaximumFractionDigits(3);
 System.out.println(pctFormatter.format(interestRate));
 
 //pg 105
		String name = "Joel";
		int age = 39;
		System.out.printf("This man is %s and he is %d years old.%n", name, age);
		
		
		double price1 = 99999.99;
		double price2 = 888.88;
		String label = "Price";
		
		//floating number
		System.out.printf("%f%n", price1);
		// .2 = 2 decimal places; , = thousands comma
		System.out.printf("%, .2f%n", price2);
		//%-10 makes it left-aligned.  10 pads it 10 spaces.  2 decimal places.  new line
		System.out.printf("%-10s%,10.2f%n", label, price1);
		
		System.out.printf("%-10s%,10.2f%n", label, price2);
		
		
		System.out.println("END!");
	}

}
