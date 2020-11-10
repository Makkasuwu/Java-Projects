package employee;

public class SimpleEmployee {
	private String my_Name;
	private double my_salary;

	public SimpleEmployee(String employeeName, double annualSalary)
	{
		my_Name = employeeName;
		my_salary = annualSalary;
	}
public String getName()
{
	return my_Name;
}
public double getAnnualSalary()
{
	return my_salary;
}
public double getMonthlySalary()
{
	return my_salary / 12.0;
}
public void giveRaise(double raisePercentage)
{
	my_salary = my_salary*raisePercentage+my_salary;
	
}
}
