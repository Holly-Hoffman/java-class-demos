import java.util.Scanner;

public class FirstProgramApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Welcome to my first Java Program!");
//This is one line of a comment

/*
 * This is many!
 */

int a = 5;
int b = 9;
int sum = a+b;
System.out.println("Sum is " + sum);

String sentence = String.format("The sum is %s", sum);
System.out.println(sentence);

double price = 19.99;

int c = 9/5;
int d = 9%5;

//scanner is similar to system.writeline
Scanner sc = new Scanner(System.in);
System.out.print("Hi, what's your name? ");
String name = sc.nextLine();

System.out.print("Enter a whole number. ");
int nbr2 = Integer.parseInt(sc.nextLine());

System.out.print("Enter another whole number. ");
int nbr3 = sc.nextInt();

sc.nextLine();

String choice = "y";
System.out.print("Continue? (y/n) ");
String resp = sc.nextLine();

//don't do this - checking to see if they point to the same thing in memory
//does not compare values - compares objects in memory
if (choice == resp)
{
System.out.println("choice and resp are the same");	
}

//this compares strings
if (choice.equalsIgnoreCase(resp))
{
	System.out.println("this is the better method and it works too");

}


System.out.println("\nWhile loooooops");
while (choice.equalsIgnoreCase("y"))
{System.out.println("Continue? ");
choice = sc.nextLine();
}



System.out.println("Bye!");
	}

}
