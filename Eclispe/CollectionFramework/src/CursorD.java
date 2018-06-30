import java.util.*;

public class CursorD {
	
	public static void main( String[] args)
	{
		Vector v = new Vector();
		Enumeration e = v.elements();
		Iterator itr = v.iterator();
		ListIterator litr = v.listIterator();
		
		System.out.println( e.getClass().getName() );
		System.out.println( itr.getClass().getName() );
		System.out.println( litr.getClass().getName() );
	}

}
