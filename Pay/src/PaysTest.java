import java.util.Scanner;


public class PaysTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.out.println("Enter your skill level 1,2,3:");
		Scanner scanner = new Scanner(System.in);
		String skillLevel = scanner.nextLine();
		if(skillLevel.equals("1")) {
		System.out.println("Your hours worked are 5");
		}
		else if (skillLevel.equals( "2")){
        System.out.println("your hours worked are 3");
        }
		if(skillLevel.equals("3")) {
		System.out.println("Your hours worked are 4");
		}
		else if (skillLevel.equals("0")){
        System.out.println("your hours worked are 0");
		}
		System.out.println("Retirement? yes or no: ");
		Scanner scanner1 = new Scanner(System.in);
		String insurance = scanner1.nextLine();
		if(insurance.equals("yes")){
	    System.out.println("you decided to pay 3% for retirement");
		}

	}

}
