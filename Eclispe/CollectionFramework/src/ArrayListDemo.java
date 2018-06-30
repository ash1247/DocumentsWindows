import java.io.Serializable;
import java.util.*;

public class ArrayListDemo {
	
	public static void main(String[] args){

	@SuppressWarnings("rawtypes")
	ArrayList<Comparable> l = new ArrayList<Comparable>();
	LinkedList<?> l1 = new LinkedList<Object>();
	List l2 = Collections.synchronizedList(l);
	
	l.add("A");
	l.add(10);
	l.add("A");
	l.add(null);
	System.out.println(l);
	
	l.remove(2);
	System.out.println(l);
	
	l.add( 2, "M");
	l.add( "N");
	System.out.println(l);
	
	System.out.println( l instanceof Serializable );
	System.out.println( l1 instanceof Cloneable );
	System.out.println( l instanceof RandomAccess );
	System.out.println( l1 instanceof RandomAccess );
	System.out.println(l2);
	
	}
}