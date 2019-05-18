package activity3_Pulumbarit;


import java.util.*;  

public class controlFlowStructure_Pulumbarit 
{

	public static void main(String[] args) 
	{

        Scanner in = new Scanner(System.in);  
        System.out.print("Enter your name: ");    
        String name = in.next();  
        
        System.out.print("Number of times to print: ");  
        int i = in.nextInt();  

  
        if (i <= 4)
        {
        	System.out.println(name);
        }
        
        else
        {
        	for (int a = 0; a < i; a++)
        	{
        		System.out.println(name);
        	}
        	
        }
        
        in.close();
		
	

	}

}
