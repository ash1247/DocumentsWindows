import java.util.ArrayList;
import java.util.Iterator;

public class IteratorD {
	
	public static void main( String[] args)
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
	
		for( int i = 0; i <= 10; i++)
		{
			al.add(i);
		}
		System.out.println(al);
		
		Iterator<Integer> itr = al.iterator();
		
		while(itr.hasNext() )
		{
			int j = (int)itr.next();
			if ( j % 2 == 0)
				System.out.println(j);
			else
				itr.remove();
		}
		System.out.println(al);
	}
}
