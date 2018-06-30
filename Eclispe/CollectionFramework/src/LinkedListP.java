import java.util.LinkedList;

public class LinkedListP {

	public static void main( String[] args)
	{
		LinkedList l = new LinkedList();
	
		l.add("Sagor");
		l.add(30);
		l.add(null);
		l.add("O+");
		l.set(0, "Ashik");
		l.add(1 ,"Hosen");
		l.removeLast();
		l.addFirst("Name");
		
		System.out.println(l);
		
	}
}
