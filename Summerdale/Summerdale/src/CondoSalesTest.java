



public class CondoSalesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CondoSales Condo1 = new CondoSales("Park View ",150000);
		CondoSales Condo2 = new CondoSales("Golf course",170000);
		CondoSales Condo3 = new CondoSales("Lake Views",210000);
		
		
		
		System.out.println("Condo #1");
	    System.out.println("Name: " +  Condo1.getName());
	    System.out.println("Price: " +  Condo1.getPrice());
	    
	    System.out.println("Condo #2");
	    System.out.println("Name: " +  Condo2.getName());
	    System.out.println("Price: " +  Condo2.getPrice());
	    
	    System.out.println("Condo #3");
	    System.out.println("Name: " +  Condo3.getName());
	    System.out.println("Price: " +  Condo3.getPrice());
	}

	
	}


