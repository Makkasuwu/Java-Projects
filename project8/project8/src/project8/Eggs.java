package project8;
import java.util.Scanner;
public class Eggs {
	
	

	public static void main(String[] aaaaargs){
		
	//Make descriptive names that cannot get mixed up.
	int dozenEggs= 0;
	int Eggs= 0;
	double pricePerDozen= 3.25;
	double individual= .45;
	int numOfEggs=0;
	String entry;
	double price= 0;

	Scanner S = new Scanner(System.in); //making the scanner object

	//first is the class you'll make an object from
	//second is the name you'll give the object. after put = new
	//after that you declare the constructor to make the object from.

	System.out.println("Enter Number of Eggs");
	entry = S.nextLine();

	numOfEggs = Integer.parseInt(entry);  //when a user enters something into a program it's always a String. In order to make it into a number, we used Integer.parseInt();

	dozenEggs = numOfEggs / 12;
	Eggs = numOfEggs % 12;  // % is the modules, it makes it so the outcome is a decimal and not a whole number.

	price = (pricePerDozen * dozenEggs)+(individual * Eggs);

	System.out.println("You Ordered "+numOfEggs+" Eggs.That's "+dozenEggs+" dozen at $3.25 per dozen and "+Eggs+
						" loose eggs at .45 cents each for a total of $"+price);

	}
}
