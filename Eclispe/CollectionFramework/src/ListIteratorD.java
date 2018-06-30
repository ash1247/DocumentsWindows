import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorD {
		
	public static void main( String[] args)
	{
		LinkedList ll = new LinkedList();
		
		ll.add("ass");
		ll.add("hoga");
		ll.add("putki");
		ll.add("pasa");
			
		System.out.println(ll);
			
		ListIterator ltr = ll.listIterator();
			
		while(ltr.hasNext() )
		{
			String s = (String)ltr.next();
				
		if ( s == "putki")
		{
			ltr.remove();
		}
					
		else if (s == "ass")	
		{
			ltr.add("anal");
		}
		
		else if ( s == "hoga")
			ltr.set("haga");

		System.out.println(ll);
		}


	}
}
