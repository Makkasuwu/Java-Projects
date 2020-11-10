package interest;

public class Investment {
private int interests;
private double startBalance;

public Investment()
{
	interests = (int) .5; 
	startBalance = 45;
	
}
	
	public void interests(int intr)
	{
		interests = intr;
	}
	public void setBalance(double bal)
	{
		startBalance = bal;
	}
	public double getBalance()
	{
		return startBalance;
	}
	public double deductMonthlyBalance()
	{
		return startBalance;
	}
	
	
	}
	