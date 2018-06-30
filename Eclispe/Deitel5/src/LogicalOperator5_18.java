
public class LogicalOperator5_18 {

	public static void main(String [] args)
	{
		System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
				"Conditional AND (&&)", "false && false", (false && false),
				"false && true", (false && true),
				"true && false", (true && false),
				"true && true", ( true && true) );
		
		System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
				"Conditional OR (||)", "false || false", (false || false),
				"false || true", (false || true),
				"true || false", (true || false),
				"true || true", ( true || true) );
		
		System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
				"Boolean Logic AND (&)", "false & false", (false & false),
				"false & true", (false & true),
				"true & false", (true & false),
				"true & true", ( true & true) );
		
		System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
				"Boolean Logic Inclusive OR (|)", "false | false", (false | false),
				"false | true", (false | true),
				"true | false", (true | false),
				"true | true", ( true | true) );
		
		System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
				"Boolean Logic Exclusive OR (^)", "false ^ false", (false ^ false),
				"false ^ true", (false ^ true),
				"true ^ false", (true ^ false),
				"true ^ true", ( true ^ true) );
	}
}
