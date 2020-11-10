

	import java.util.Scanner;

	public class CreatePurchase extends Purchase
	{
	    public static void main(String[] args)
	    {

	        int invoice;
	        double saleAmount;
	        invoice = 0;
	        saleAmount = 0.0;
	       
			Purchase order = new Purchase();

	      
			Scanner input = new Scanner(System.in);
	        System.out.println("Please enter the invoice number: ");
	        invoice = input.nextInt();
	        System.out.println("Please enter the sale amount: ");
	        saleAmount = input.nextDouble();

	        while (InvoiceNumber < 1000 || InvoiceNumber > 8000)
	        {
	            System.out.println("You entered an invalid number.");
	            System.out.println("Please enter a number between 1000 and 8000.");
	            invoice = input.nextInt();
	        }   

	        while (saleAmount < 0)
	        {
	             System.out.println("You entered an invalid number."); 
	             System.out.println("Please enter a number greater than 0.");
	             saleAmount = input.nextDouble();
	        }
	        System.out.println(order.toString());
	}
	}

