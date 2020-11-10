
public class Scholarships2 {

	private double gpa;
	private int act;
	private int serv;
	private int total;
	
	public void setgpa(double g)
	{
		gpa = g;
	}
	
	public void setAct(int a)
	{
		act = a;
	}
	
	public void setserv(int se)
	{
		serv = se;
	}
	
	
	public int Calc()
	{
		total = act + serv;
		return total;
	}

	public String toString()
	{
		String str = super.toString();
		
if ( gpa >=3.8 & act >=1 & serv >= 1)
{
	str = "Scholarship Candidate";
}
else if (gpa < 3.8 & gpa >= 3.4 & total >= 3)
{
	str = "Scholarship Candidate";
}
else if (gpa < 3.4 & gpa >= 3.0 & act >= 2 & serv >= 3)
{
	str = "Scholarship Candidate";
}
else if(gpa < 0 & gpa > 4.0 )
{
	str = "Not a candidate";
}
else
	str = "Not a candidate";

return str;
}
}