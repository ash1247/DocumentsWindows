import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetWithCustomizedSortingD {
	
	public static void main(String[] args)
	{
		TreeSet t = new TreeSet(new MyComparatorS() );
	
		t.add(0);
		t.add(10);
		t.add(5);
		t.add(20);
		t.add(15);
	
		System.out.println(t);
	}
}
class MyComparator implements Comparator
{
	public int compare( Object obj1, Object obj2 ) 
	{
		Integer I1 = (Integer)obj1;
		Integer I2 = (Integer)obj2;
		
		if( I1 < I2 )
			return +1;
		else if( I1 > I2 )
			return -1;
		else 
			return 0;
	}
}

class MyComparatorS implements Comparator
{
	public int compare( Object obj1, Object obj2 ) 
	{
		Integer I1 = (Integer)obj1;
		Integer I2 = (Integer)obj2;
		return -I1.compareTo(I2);
		//return I2.compareTo(I1);
		//return -I2.compareTo(I1);
		//return +1;
		//return -1;
		//return 0;
	}
}