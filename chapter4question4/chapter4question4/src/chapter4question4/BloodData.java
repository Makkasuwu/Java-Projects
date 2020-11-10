package chapter4question4;

public class BloodData {

	public String O;
	public String A;
	public String B;
	public String Ab;
	public String plus;
	public String minus;
	public String BloodType;
	public String Factor;
	
	
	public BloodData(String BT, String F, int B)
	{
		BloodType = BT;
		Factor = F;
		BloodType = O;
	}
	
	public void setBloodType(String BT)
	
	{
		BloodType = BT;
	}
	public void setFactor(String F)
	{
		Factor = F;
	}
	public String getBloodType()
	{
		return BloodType;
	}
	public String getFactor()
	{
		return Factor;
	}
	public String toString()
	{
		return "Your Blood type is Type "+BloodType+". Your Factor is "+Factor+".";
	}
}
