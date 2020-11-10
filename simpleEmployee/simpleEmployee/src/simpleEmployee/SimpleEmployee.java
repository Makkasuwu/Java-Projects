package simpleEmployee;

public class SimpleEmployee{
public String Name;
public double Salary;


public SimpleEmployee(String n,  double d)
{
	Name = n;
	Salary= d;
}

public String getName()
{
	return Name;
}

public double getAnnualSalary()
{
	return Salary;
	
}
public double getMonthlySalary()
{
	return  Salary/12.0;
	
}
public double giveRaise(double RaisePercentage)
{
	return Salary += Salary * RaisePercentage +Salary;
}
}