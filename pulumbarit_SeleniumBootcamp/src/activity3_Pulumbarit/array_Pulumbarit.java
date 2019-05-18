package activity3_Pulumbarit;

public class array_Pulumbarit {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] numbers = {0,1,0,4,0,0,7};
		System.out.println("Length is " + numbers.length);
		
		for (int i = 0; i < numbers.length; i++)
			if (numbers[i] > 0)
			{
				System.out.println(numbers[i]);
			}

	}

}
