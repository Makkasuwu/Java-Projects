
		import javax.swing.JOptionPane;
		public class Tickets{
		public static void main(String[] args){
			
			String name = "";
			int adultPrice = 0;
			int childPrice= 0;
			int adultSold=0;
			int childSold=0;
			double percent=0;
			
					name = JOptionPane.showInputDialog(
	                        	null, "Please enter the name of the movie: ");

	                adultPrice = Integer.parseInt(
	                        JOptionPane.showInputDialog(
	                             null, "Please enter the adult price of tickets: "));
	                
	                childPrice = Integer.parseInt(
	                        JOptionPane.showInputDialog(
	                             null, "Please enter the child price of tickets: "));
	               
	                adultSold = Integer.parseInt(
	                        JOptionPane.showInputDialog(
	                             null, "Please the amount of adult tickets sold: "));
	              
	                childSold = Integer.parseInt(
	                        JOptionPane.showInputDialog(
	                             null, "Please enter the amount of children tickets sold: "));
	               
	                percent= Double.parseDouble(
	                        JOptionPane.showInputDialog(
	                             null, "Please enter the percent of gross pay to be donated to charity: "));
	                
	                int totalTickets = childSold+adultSold;
	                int totalCost = (childPrice*childSold)+(adultPrice*adultSold);
	               
	                double donated= totalCost * percent /100;
	                double  netSale= totalCost- donated;
	                		
		        JOptionPane.showMessageDialog(null, "The movie is " + name+".\n The number of tickets sold were "+totalTickets+
		        		". \n The total cost of the tickets are $"+totalCost+". \n The total percentage you donated "
		        		 + "out of gross was "+percent+"%. \n The amount donated was $"+netSale );
		        
		       
	}

}
