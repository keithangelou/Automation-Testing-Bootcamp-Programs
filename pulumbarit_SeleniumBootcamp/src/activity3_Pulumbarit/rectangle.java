package activity3_Pulumbarit;

public class rectangle 
{
	double length;
	double width;
	
	public void computeArea()
	{
		double area = length*width;
		System.out.println("The area of the rectangle is: " + area);
	}
	
	public void computePerimeter()
	{
		double perimeter = (2*length)+(2*width);
		System.out.println("The perimeter of the recatangle is: " + perimeter);
	}
}
