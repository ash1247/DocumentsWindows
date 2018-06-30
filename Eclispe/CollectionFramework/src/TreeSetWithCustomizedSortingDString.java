import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetWithCustomizedSortingDString {
		
	public static void main(String[] args)
	{
		
		TreeSet t = new TreeSet(new MyComparatorString() );
		
		t.add("Ass");
		t.add("Honda");
		t.add("Boka");
		t.add("Zoon");
		t.add("LuTha");
			
		System.out.println(t);
			
	}
}

class MyComparatorString implements Comparator
{
	public int compare( Object obj1, Object obj2 ) 
	{
		String s1 = (String)obj1;
		String s2 = obj2.toString();
	
		return -s1.compareTo(s2);
	}
}