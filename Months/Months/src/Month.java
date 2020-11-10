
public class Month {

	private int monthNumber;
	private static  String monthName;
	
	public Month()
	{
		monthNumber=1;
	}
	
	
	public Month(int m)
	{
		if(monthNumber <= 1 || monthNumber > 12)
		{
			monthNumber=1;
		}
	}
	
	
	public int setmonthNumber()
	{
		return monthNumber;
	}
	public String setmonthName()
	{
		return monthName;
	}
	public int getmonthNumber(int mn)
	{
		return mn;
	}
	public int getmonthName(int m)
	{
		return m;
	}
	 public static String main(String[] args) {

	        int monthNumber = 1;
	        String monthNameString;
	        switch (monthNumber) {
	            case 1:  monthNameString = "January";
	                     break;
	            case 2:  monthNameString = "February";
	                     break;
	            case 3:  monthNameString = "March";
	                     break;
	            case 4:  monthNameString = "April";
	                     break;
	            case 5:  monthNameString = "May";
	                     break;
	            case 6:  monthNameString = "June";
	                     break;
	            case 7:  monthNameString = "July";
	                     break;
	            case 8:  monthNameString = "August";
	                     break;
	            case 9:  monthNameString = "September";
	                     break;
	            case 10: monthNameString = "October";
	                     break;
	            case 11: monthNameString = "November";
	                     break;
	            case 12: monthNameString = "December";
	                     break;
	            default: monthNameString = "Invalid month";
	                     break;
	        }
	        
	        return monthName;
}
	 public String toString()
	 {
		return monthName;
		 
	 }
	 
	 
}
