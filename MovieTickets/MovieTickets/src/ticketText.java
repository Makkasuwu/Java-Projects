 	import java.io.FileReader;
	    import java.io.IOException;
	    import java.io.PrintWriter;
	    import java.util.Scanner;
	    public class ticketText {

		

	   
	     
	          public static void main(String[] args) throws IOException
	            {
	                    FileReader reader = new FileReader("employeeData.txt");
	                    PrintWriter hourly = new PrintWriter("hourly.txt");
	                    PrintWriter salaried = new PrintWriter("salaried.txt");
	                   
	                    Scanner in = new Scanner(reader);
	                    double pay;
	                    double totalGrossPay = 0;
	                    double totalHourly = 0;
	                    double totalSalary = 0;
	                    int numHourly = 0;
	                    int numSalary = 0;
	                    int numTotalEmp = 0;
	                   
	                    System.out.printf("%-20s%s\n", "Employee", "Gross Pay");
	                    while(in.hasNext())
	                    {
	                            String last = in.next();
	                            last = last.substring(0, last.length() -1);
	                            String first = in.next();
	                            int category = Integer.parseInt(in.next());
	                           
	                            numTotalEmp++;
	                           
	                            if(category == 0)
	                            {
	                                    double salary = Double.parseDouble(in.next());
	                                    pay = salary / 52;
	                                    numSalary++;
	                                    totalSalary += pay;
	                                    salaried.printf("%-20s$%5.2f\n", first + " " + last, pay);
	                            } else {
	                                    double wage = Double.parseDouble(in.next());
	                                    int hours = Integer.parseInt(in.next());
	                                    pay = wage * hours;
	                                    numHourly++;
	                                    totalHourly += pay;
	                                    hourly.printf("%-20s$%5.2f\n", first + " " + last, pay);
	                            }
	                            totalGrossPay += pay;
	                            System.out.printf("%-20s$%5.2f\n", first + " " + last, pay);
	                    }
	                    reader.close();
	                    hourly.close();
	                    salaried.close();
	                   
	                    System.out.printf("\nTotal gross pay: $%6.2f", totalGrossPay);
	                    System.out.printf("\nTotal gross pay for hourly: $%6.2f", totalHourly);
	                    System.out.printf("\nTotal gross pay for salaried: $%6.2f", totalSalary);
	                    System.out.printf("\n\nAverage gross pay: $%6.2f", totalGrossPay / numTotalEmp);
	                    System.out.printf("\nAverage gross pay for hourly: $%6.2f", totalHourly / numHourly);
	                    System.out.printf("\nAverage gross pay for salaried: $%6.2f", totalSalary / numSalary);
	            }
	    


	}


