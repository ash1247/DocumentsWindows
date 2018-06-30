import java.util.Scanner;

public class Ex8_4Rectangle {
	
	private double length;
	private double width;
	double perimeter;
	double area;
	
	Scanner input = new Scanner(System.in);
	
	void setLength(double lgth)
	{
		System.out.print("Enter length (0-20): ");
		lgth = input.nextDouble();
		if( (lgth >= 0) && (lgth <= 20))
			length = lgth;
		else
		{
			System.out.print("Your given value exceedeed limit so default value = 1 is set as length.\n");
			length = 1.00;
		}
	}

	void setWidth(double wdth)
	{
		System.out.print("Enter width (0-20): " );
		wdth = input.nextDouble();
		if((wdth >= 0) && (wdth <= 20))
			width = wdth;
		else
		{
			System.out.print("Your given value exceedeed limit so default value = 1 is set as width.\n");
			width = 1.00f;
		}
	}
	
	double getLength()
	{
		return length;
	}
	double getWidth()
	{
		return width;
	}
	
	public double perimeter()
	{
		
		perimeter = 2 * (width + length);	
		
		
		return perimeter;
	}

	public double area()
	{
	
		area = (length * width);
		
		return area;
	}
	public void displayMessage()
	{
		System.out.printf("Area: %.3f\n", area );
		System.out.printf("Perimeter: %.3f\n", perimeter );
	}

}
