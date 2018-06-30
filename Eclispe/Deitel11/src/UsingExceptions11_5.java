
public class UsingExceptions11_5 {

	public static void main( String[] args)
	{
		try
		{
			method1();
		}
		catch( Exception e)
		{
			System.err.printf( "%s\n\n", e.getMessage() );
			e.printStackTrace();
			
			StackTraceElement[] traceElements = e.getStackTrace();
			
			System.out.println( "\nStack trace from getStackTrace:");
			System.out.println( "Class\t\t\tFile\t\t\t\tLine\tMethod" );
			
			for ( StackTraceElement element : traceElements)
			{
				System.out.printf( "%s\t", element.getClassName() );
				System.out.printf( "%s\t", element.getFileName() );
				System.out.printf( "%s\t", element.getLineNumber() );
				System.out.printf( "%s\n", element.getMethodName() );
			}
		}
	}
	
	public static void method1() throws Exception
	{
		method2();
	}
	
	public static void method2() throws Exception
	{
		method3();
	}
	
	public static void method3() throws Exception
	{
		throw new Exception( "Exception thrown in method3" );
	}
}
