package project9;
import java.util.Scanner;

public class DogBoarding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double weight = 0;
int numberOfDays= 0;
double perPound = .50;
double price = 0;
String Entry;
Scanner S = new Scanner(System.in);
System.out.println("Enter the weight ");
Entry= S.nextLine();

weight = Double.parseDouble(Entry);
System.out.println("Enter the number of days");
Entry= S.nextLine();

numberOfDays = Integer.parseInt(Entry);

price = (weight * perPound) * (numberOfDays);



System.out.println(" The weight of the dog is "+weight+" the number of days to be boarded is "+numberOfDays+" The total cost is "
					+price);

	}

}
