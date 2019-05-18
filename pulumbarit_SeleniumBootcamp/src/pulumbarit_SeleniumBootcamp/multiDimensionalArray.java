package pulumbarit_SeleniumBootcamp;

import java.util.Arrays;

public class multiDimensionalArray 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String[][] testResults =
			{
				{"TC-001", "Register", "Pass"},
				{"TC-002", "Login", "Pass"},
				{"TC-003", "Change Password", "Fail"}
			};
	
		System.out.println(testResults[2][1]);
		
		testResults[2][2] = "Pass";
		
		System.out.print(Arrays.deepToString(testResults));
	}

}
