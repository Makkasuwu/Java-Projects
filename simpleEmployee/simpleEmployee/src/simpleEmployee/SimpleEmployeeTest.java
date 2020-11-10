package simpleEmployee;

public class SimpleEmployeeTest {

	public static void main( String[] args )
	  {
	    SimpleEmployee empOne = new SimpleEmployee( "Jack", 52000.00 );
	    SimpleEmployee empTwo = new SimpleEmployee( "Jill", 53000.00 );

	    System.out.println( empTwo.getName( ) + " annual " + empTwo.getAnnualSalary( ) );

	    System.out.println( empTwo.getName( ) + " monthly " + empTwo.getMonthlySalary( ) );

	    System.out.println( empOne.getName( ) + " annual " + empOne.getAnnualSalary( ) );
	    System.out.println( empOne.getName( ) + " monthly " + empOne.getMonthlySalary( ) );

	    empTwo.giveRaise( 0.05 );
	    empOne.giveRaise( 0.10 );

	    System.out.println();
	    System.out.println("New salaries after raises");
	    System.out.println();

	     	System.out.println( empTwo.getName( ) + " annual " + empTwo.getAnnualSalary( ) );

		     System.out.println( empTwo.getName( ) + " monthly " + empTwo.getMonthlySalary( ) );

		     System.out.println( empOne.getName( ) + " annual " + empOne.getAnnualSalary( ) );
		     System.out.println( empOne.getName( ) + " monthly " + empOne.getMonthlySalary( ) );

	 
	  }
}


