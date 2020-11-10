
public class Class {
	private String Name;
	private int IdNumber;
	private String Department;
	private String Position;
	
	public Class()
	{
		Name = "";
		IdNumber = 0; 
		Department = ""; 
		Position =  "";
	}
	public Class(String n, int Id, String dept, String pos)
	{
		Name = n;
		IdNumber = Id; 
		Department = dept; 
		Position =  pos;
	}
	public Class(String n, int Id)
	{
		Name = n;
		IdNumber = Id; 
		Department = ""; 
		Position =  "";
	}
	public void setName(String n)
	
		{
			Name = n;
		}

	public void setIdNumber(int Id)
	
	{
		IdNumber = Id; 
	}
	public void setDepartment(String D)
	
	{
		Department = D;
	}
	public void setPosition(String p)
	
	{
		Position =  p;
	}
	
	public String getName()
	{
		return Name;
	}
	public int getIdNumber()
	{
		return IdNumber;
	}
	public String getDepartment()
	{
		return Department;
	}
	public String getPosition()
	{
		return Position;
	}
	public String toString()
	{
		return "Name" + Name+ "Idnumber" +IdNumber+"Department"+Department+"Position"+Position;
	}
	}


