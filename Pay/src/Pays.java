

public class Pays {
private int Hours;
private int Rate;
private double RegularPay;
private double OvertimePay;
private double Total;
private double Deductions;
private double Netpay;

public void setHours(int h)
{
	Hours=h;
}
public void setRate(int r)
{
	Rate=r;
}
public void setRegularPay(int rp)
{
	RegularPay=rp;
}
public void setOvertimePay(int op)
{
	OvertimePay=op;
}
public int getHours()
{
	return Hours;
}
public int getRate()
{
	return Rate;
}
public double getRegularPay()
{
	return RegularPay;
}
public double getOvertimePay()
{
	return OvertimePay;
}
public double getTotal()
{
	return Total= RegularPay+OvertimePay;
}
public double getDeductions()
{
	return Deductions;
}
public double getNetpay()
{
	return Netpay= Total-Deductions;
}
}
