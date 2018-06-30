//Example 5.6
// Program of Declaration, initialization, type conversions, Modulo Operations, Logic operations
public class Example56 {
	public static void main(String [] args)
	{
		// Declaration and Initialization
		int a = 10, b = 5, c= 8, d =2;
		float x = 6.4F, y = 3.0F;
		
		//Order of Evaluation
		
		int answer1 = a * b + c / d;
		int answer2 = a * (b + c) / d;
		
		//Type Conversions
		
		float answer3 = a / c;
		float answer4 = (float) a / c;
		float answer5 = a / y;
		
		// Modulo Operations
		
		int answer6 = a % c;
		float answer7 = x % y;
		
		//Logic Operations
		
		boolean bool1 = a > b && c > d;
		boolean bool2 = a < b && c > d;
		boolean bool3 = a < b || c > d;
		boolean bool4 = ! ( a - b == c);
		
		System.out.println("Order of Evaluation");
		System.out.printf(" a * b + c / d = %d\n", answer1);
		System.out.printf(" a * (b + c) / d = %d\n", answer2);
		
		System.out.println("Type Conversion");
		System.out.printf(" a / c = %.0f\n", answer3 );
		System.out.printf(" (float) a / c = %.2f\n", answer4);
		System.out.printf(" a / y = %f\n", answer5);
		
		System.out.println("Modulo Operations");
		System.out.printf(" a %% c = %d\n", answer6);
		System.out.printf(" x %% y = %f\n", answer7);
		
		System.out.println("Logical Operations");
		System.out.printf(" a > v && c >d = %s\n", bool1);
		System.out.printf(" a < b && c > d = %s\n", bool2);
		System.out.printf(" a < b || c > d = %s\n", bool3);
		System.out.printf(" ! ( a - b == c) = %s\n", bool4);
		
	}
}
