package homework1;

import java.util.Scanner;

public class homework {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		calculator cal = new calculator();
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("How many apples do you want to order? ");  
        int apple = in.nextInt();
        cal.orderPrice = apple* cal.applePrice;
        int o = cal.orderPrice;
        System.out.println("Order Price: " + o);
		
        
        double tax = o*0.12;
        cal.tax = tax;
        System.out.println("Tax "+ (tax));
        
        int delFee;
        if (cal.orderPrice > 1000)
        {
        	cal.deliveryFee = 0;
        	delFee = cal.deliveryFee;
        	System.out.println("Delivery Charge: P" + delFee);
        }
        
        else
        {
        	cal.deliveryFee = 250;
        	delFee = cal.deliveryFee;
        	System.out.println("Delivery Charge: P" + delFee);
        }
        
        cal.compute();
        in.close();
        
	}

}
