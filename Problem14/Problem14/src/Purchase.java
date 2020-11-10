import java.util.Scanner;


public class Purchase {
	
	  protected  static int InvoiceNumber = 0;
	    protected double SalePrice = 10.00;
	  private  double SalesTax;
	   
	    Scanner input = new Scanner(System.in);
	    
	    public void setInvoiceNumber(int invoice)
	    {
	        InvoiceNumber = invoice;
	        System.out.println("Please enter the invoice number: ");
	        
	        InvoiceNumber = input.nextInt();
	       
	    }
	    
	   
	   
	    public void setSalePrice(double saleAmount)
	    {
	        SalePrice = saleAmount;
	        SalesTax = (saleAmount * .05);
	    }

	    public String toString()
	    {
	       return ("Your invoice number is:" + InvoiceNumber + "."+ "Your sale amount is: " + SalePrice + "." +
	    		   "Your sales tax is: " + SalesTax + ".");
	    }

	 }

