
public class CondoSales {
	
	private String Name;
	private int Price;
	private int length;
	public CondoSales()
	{
		Name = "";
		Price= 0;
	}
	public CondoSales(String n, int p)
	{
		Name = n;
		Price= p;
	}
	public CondoSales(String n, int p, int l)
	{
		Name = n;
		Price= p;
		length= 0;
	}
	public void setName(String n)
	
		{
			Name = n;
		}
	public void setPrice(int p)
	{
		Price= p;
	}
	public String getName()
	{
		return Name;
	}
	public double getPrice()
	{
		return Price;
	}
	
	public String toString()
	{
		return "Name" + Name+ "price" +Price;
	}
	}


