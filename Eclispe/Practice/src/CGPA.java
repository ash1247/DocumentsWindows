import java.util.Scanner;

public class CGPA {

	public static void main(String[] args)
	{
		double credit = 0;
		int n;
		double totalPoint = 0;
		double GPA = 0;
		double GPASum = 0;
		double creditSum = 0;
	
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Please enter how many subject's GPA you want to count:");
		n = input.nextInt();
		
		/*System.out.printf("Please enter the total credit of this semester: ");
		totalCredit = input.nextDouble();*/
		
		for ( int count = 0; count < n; count++)
		{
		
			System.out.printf("Please enter the credit of the subject no %d: ", (count + 1) );
			credit = input.nextDouble();
			creditSum += credit;
			credit = creditSum;
			
			System.out.printf("Please enter the obtained GPA of the subject no %d: ", (count + 1) );
			GPA = input.nextDouble();
			while(GPA >= 4.10)
			{
				GPASum += GPA ;
				GPA = GPASum;
				
				if( GPA >= 4.0)
				{
					System.out.printf("Please enter GPA between 0.0 - 4.0.\n");
					System.out.printf("Please enter the obtained GPA of the subject no %d: ", (count + 1) );
					GPA = input.nextDouble();
				}
				
				else
				{
					GPASum += GPA ;
					GPA = GPASum;
				}
			}
			
			totalPoint = GPA * credit;

		}
		System.out.printf("CGPA = %.2f", (totalPoint / n) / credit );
	}
}
