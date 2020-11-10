package employee;

public class TestSimpleEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SimpleEmployee empOne = new SimpleEmployee("Jack",52000.00);
SimpleEmployee empTwo = new SimpleEmployee("Jill", 53000.00);
System.out.println(empTwo.getName());
System.out.println(empTwo.getAnnualSalary());
System.out.println(empOne.getName());
System.out.println(empOne.getMonthlySalary());



empTwo.giveRaise(0.05);
	}

}
