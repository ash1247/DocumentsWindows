//Example 7.1
// A Program where users are asked to enter a String and the the computer read it and print it back.
public class Example71 {
	public static void main(String[] args)
	{
		StringBuffer string = new StringBuffer();
		char c;
		System.out.println("Enter a string ");
		
		try
		{
			while ( (c = (char)System.in.read()) != '\n')
			{
				string.append(c); // Append character
			}
		}
		catch (Exception e)
		{
			System.out.println("Error in input");
		}
		System.out.println(" You have entered ... ");
		System.out.println(string);
	}
}
