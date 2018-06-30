import java.util.*;

public class TreeSetEmployee implements Comparable<Object> {
	
	String name;
	int id;
	
	public TreeSetEmployee(String name, int id)
	{
		this.name = name;
		this.id = id;
	}
	
	public String toString()
	{
		return name+"--"+id;
	}
	
	public int compareTo(Object obj)
	{
		int id1 = this.id;
		TreeSetEmployee e = (TreeSetEmployee)obj;
		
		int id2 = e.id;
		
		if( id1 < id2 )
			return -1;
		else if( id1 > id2 )
			return +1;
		else 
			return 0;
	}
	public static void main(String[] args)
	{
		TreeSetEmployee e1 = new TreeSetEmployee("Ash", 60);
		TreeSetEmployee e2 = new TreeSetEmployee("Asif", 62);
		TreeSetEmployee e3 = new TreeSetEmployee("Shafayet", 64);
		TreeSetEmployee e4 = new TreeSetEmployee("Safat", 69);
		TreeSetEmployee e5 = new TreeSetEmployee("Himel", 70);
		TreeSetEmployee e6 = new TreeSetEmployee("Ash", 60);
		
		TreeSet<TreeSetEmployee> t = new TreeSet<TreeSetEmployee>();
		
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		t.add(e6);
		System.out.println(t);
		
		TreeSet<TreeSetEmployee> t1 = new TreeSet<TreeSetEmployee>(new myComparatorE() );
	
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		t1.add(e5);
		t1.add(e6);
		System.out.println(t1);
	}

}

class myComparatorE implements Comparator<Object>
{
	public int compare(Object obj1, Object obj2)
	{
		TreeSetEmployee e1 = (TreeSetEmployee)obj1;
		TreeSetEmployee e2 = (TreeSetEmployee)obj2;
		
		String s1 = e1.name;
		String s2 = e2.name;
		return s1.compareTo(s2);
	}
}


