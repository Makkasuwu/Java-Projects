
public class DigitalCamera {

	private int MegaPixels;
	private String Brand;
	
	
	
	public void setMegaPixels(int mp)
	{
		MegaPixels = mp;
	}
	
	
	
	public void setBrand(String b)
	{
		Brand= b;
	}
	
	public String toString()
	{
		String str = super.toString();
		
if ( MegaPixels <= 6 )
{
	str = "Your camera is $99"+Brand;
}
else
{
	str = "Your camera is $129"+Brand;

}
return "Your Camera is "+str+". Your brand is"+Brand;

}
}