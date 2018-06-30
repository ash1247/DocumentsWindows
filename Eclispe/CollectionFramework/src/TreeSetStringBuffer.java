import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetStringBuffer {
	
	public static void main(String[] args)
	{
	@SuppressWarnings("unchecked")
	TreeSet<StringBuffer> t = new TreeSet<StringBuffer>(new MyComparatorStringBuffer() );
	
	t.add(new StringBuffer("P") );
	t.add(new StringBuffer("p") );
	t.add(new StringBuffer("O") );
	t.add(new StringBuffer("I") );
	t.add(new StringBuffer("U") );
	
	System.out.println(t);
	}
}

class MyComparatorStringBuffer implements Comparator<Object>
{
	public int compare( Object obj1, Object obj2 ) 
	{
		String s1 = obj1.toString();
		String s2 = obj2.toString();
	
		return s1.compareTo(s2);
	}
}
