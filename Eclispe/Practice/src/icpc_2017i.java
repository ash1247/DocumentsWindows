import java.math.BigInteger;
import java.util.Scanner;

class icpc_2017i
{
	
	static BigInteger decimal = new BigInteger("10");
	static BigInteger one = new BigInteger("1");
	static BigInteger zero = new BigInteger("0");
	
	static BigInteger sod(BigInteger z)
	{
		BigInteger p = zero;
		BigInteger q = zero;
		
		while( !z.equals( zero ) )
		{
			p = z.mod( decimal);
			z = (z.subtract(p) ).divide(decimal);
		}
		return q;
	}
    // Returns Factorial of N
    static BigInteger f(BigInteger z)
    {
    	int res = 0;
        while( res != -1 )
        {
        	 res = z.compareTo(decimal);
        	 z = sod(z);
        }
        return z;
    }
    
    static BigInteger select(BigInteger a, BigInteger b)
    {
    	if( a.equals( one ) || b.equals( zero ) )
    	{
    		return one;
    	}
    	else if( a.equals( zero ) )
    	{
    		return zero;
    	}
    	else
    	{
    		int c = b.intValue();
    		BigInteger z = a.pow(c);
    		return f(z);
    	}
    }
   
    public static void main(String args[]) throws Exception
    {
        int t;
        @SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
        t = s.nextInt();
        
        BigInteger a;
        BigInteger b;
         
         for( int i = 1; i <= t; i++)
         {
        	 a = s.nextBigInteger();
        	 b = s.nextBigInteger();
        	 
        	 System.out.println("Case " + i + ": " + select(a,b) );
         }   
    }
}