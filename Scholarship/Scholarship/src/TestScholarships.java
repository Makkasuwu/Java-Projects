import java.util.Scanner;


public class TestScholarships {

	public static void main(String[] args) {
		
		double GPA;
		int Act;
		int SERV;
		
		
		
		Scholarships s = new Scholarships();
		
		Scanner keyboard = new Scanner(System.in);

		System.out.println("What is your gpa?");
		GPA = keyboard.nextDouble();

		
		System.out.println("What is your Activities?");
		Act = keyboard.nextInt();
		System.out.println("What is your Services?");
		SERV = keyboard.nextInt();

		s.setgpa(GPA);
		s.setAct(Act);
		s.setserv(SERV);
		
		
		
		System.out.println(s.toString());
			
		}
		
	}


