
public class TestPersonWithAge {
	
		public static void main( String[] args)
		  {
		    // Test drive PersonWithAge
		    personAge one = new  personAge( "Kim", 19  );
		    personAge two = new  personAge( "Devon", 21  );
		    personAge tre = new  personAge( "Chris", 79);

		    System.out.println( one.getName( ) + "  " + one.getAge() );
		    System.out.println( two.getName( ) + "  " + two.getAge() );
		    System.out.println( tre.getName( ) + "  " + tre.getAge() );
		    System.out.println( );

		    System.out.println( one.getName( ) + " turns 21 in " + one.yearsTo( 21 ) + " years" );
		    System.out.println( two.getName( ) + " turns 40 in " + two.yearsTo( 40 ) + " years" );
		    System.out.println( tre.getName( ) + " turns 65 in " + tre.yearsTo( 65 ) + " years" );
		  }
		}



