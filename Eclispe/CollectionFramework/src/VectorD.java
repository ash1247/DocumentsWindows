import java.util.Vector;

public class VectorD {

	public static void main( String[] args)
	{
		Vector v = new Vector();
		System.out.println(v.capacity() );
		for( int i = 1; i <= 10; i++)
		{
			v.addElement(i);
		}
		System.out.println(v.capacity() );
		v.addElement("A");
		System.out.println(v.capacity() );
		System.out.println(v);
		
		Vector v1 = new Vector(25);
		System.out.println(v1.capacity() );
		for( int i = 1; i <= 10; i++)
		{
			v1.addElement(i);
		}
		System.out.println(v1.capacity() );
		v1.addElement("A");
		System.out.println(v1.capacity() );
		System.out.println(v1);
		
		
		
		Vector v2 = new Vector(10,5);
		System.out.println(v2.capacity() );
		for( int i = 1; i <= 10; i++)
		{
			v2.addElement(i);
		}
		System.out.println(v2.capacity() );
		v2.addElement("A");
		System.out.println(v2.capacity() );
		System.out.println(v2);
	}
}
