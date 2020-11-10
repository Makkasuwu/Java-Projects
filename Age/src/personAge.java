
public class personAge {
public String Name;
public int Age;


public personAge(String n,  int a)
{
	Name= n;
	Age= a;
}
public String getName()
{
	return Name;
}

public int getAge()
{
	return Age;
}
public int yearsTo(int endYear)
{
 return (endYear - Age);
}

}
