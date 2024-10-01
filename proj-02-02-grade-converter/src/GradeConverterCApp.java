import java.util.Scanner;

public class GradeConverterCApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Welcome to the Letter Grade Converter!");
Scanner sc = new Scanner(System.in);
String choice = "y";
String letterGrade = "";

while (choice.equalsIgnoreCase("y"))
{
	System.out.print("\nEnter numerical grade: ");
	int grade = sc.nextInt();
	
	if(grade >= 88) {letterGrade = "A";}
	else if (grade < 88 && grade >= 80) {letterGrade = "B";}
	else if (grade < 80 && grade >= 67) {letterGrade = "C";}
	else if (grade < 67 && grade >= 60) {letterGrade = "D";}
	else if (grade < 60) {letterGrade = "F";}
	
	System.out.println("Letter grade: " + letterGrade);
	System.out.print("\nContinue? (y/n) ");
	
	sc.nextLine();
	choice = sc.nextLine();
	}
System.out.println("Thank you for using the Letter Grade Converter App.");
	}
}
	

	


