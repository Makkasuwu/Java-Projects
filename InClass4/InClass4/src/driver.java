

	public class driver {
	public static void main(String[] args)
		   {
		      // Create three instances of the Employee class using
		      // each of the new constructors.
		      Class employee1 = new Class();
		      Class employee2 = new Class("Susan Meyers", 47899, "Accounting", "Vice President");
		      Class employee3 = new Class("Mark Jones", 39119);
		      
		      // Display the data for employee 1.
		      System.out.println("Employee #1");
		      System.out.println("Name: " +  employee1.getName());
		      System.out.println("ID Number: " +  employee1.getIdNumber());
		      System.out.println("Department: " +  employee1.getDepartment());
		      System.out.println("Position: " + employee1.getPosition());
		             
		      System.out.println();
		      
		      // Display the data for employee 2.
		      System.out.println("Employee #2");
		      System.out.println("Name: " + employee2.getName());
		                         
		      System.out.println("ID Number: " +  employee2.getIdNumber());
		                        
		      System.out.println("Department: " +  employee2.getDepartment());
		                        
		      System.out.println("Position: " +  employee2.getPosition());
		                        
		      System.out.println();
		      
		      // Display the data for employee 3.
		      System.out.println("Employee #3");
		      System.out.println("Name: " + employee3.getName());
		                         
		      System.out.println("ID Number: " + employee3.getIdNumber());
		                         
		      System.out.println("Department: " + employee3.getDepartment());
		                         
		      System.out.println("Position: " + employee3.getPosition());
		                         
		      System.out.println();
		   }
		}





