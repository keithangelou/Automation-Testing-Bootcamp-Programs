package homework1;

public class calculator 
{
	int c;
	int applePrice = 50;
	int orderPrice; 
	int deliveryFee; 
	double tax;
	
	public void compute()
	{
		System.out.println("TOTAL: P" + (orderPrice + deliveryFee + tax));
		
	}
}
