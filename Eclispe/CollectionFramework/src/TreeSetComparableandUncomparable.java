import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetComparableandUncomparable {

	public static void main(String[] args)
	{
	@SuppressWarnings("unchecked")
	TreeSet t = new TreeSet( new MyComparatorMixed() );
	
	t.add("A");
	t.add(new StringBuffer("PP") );
	t.add(new StringBuffer("p") );
	t.add(new StringBuffer("OPQ") );
	t.add(10);
	t.add(new StringBuffer("IUT") );
	t.add(new StringBuffer("U") );
	t.add("XX");
	t.add("ABCD");
	t.add("A");
	
	System.out.println(t);
	}
}

class MyComparatorMixed implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
		String s1 = obj1.toString();
		String s2 = obj2.toString();
		
		int l1 = s1.length();
		int l2 = s2.length();
		
		if ( l1 < l2 )
			return -1;
		else if ( l1 > l2 )
			return +1;
		else
			return s1.compareTo(s2);
	}

}
