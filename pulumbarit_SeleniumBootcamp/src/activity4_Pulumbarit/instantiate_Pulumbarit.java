package activity4_Pulumbarit;

import java.util.*;  

public class instantiate_Pulumbarit 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		rectangle_Pulumbarit compute = new rectangle_Pulumbarit();
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("The length is ");  
        int l = in.nextInt();  
        
        System.out.print("The width is ");  
        int w = in.nextInt(); 
        
        compute.length = l;
        compute.width = w;
        
        compute.computeArea();
        compute.computePerimeter();
		
		
        in.close();
	}

}
