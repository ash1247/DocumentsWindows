import java.util.Stack;

public class StackD {
	
	public static void main( String[] args)
	{
		Stack s = new Stack();
		System.out.println(s.isEmpty() );
		s.push("a");
		s.push("b");
		s.push("c");
		s.push(30);
		System.out.println(s.peek() );
		System.out.println(s);
		s.pop();
		System.out.println(s.peek() );
		System.out.println(s);
		System.out.println(s.search("a") );
		System.out.println(s.search("Z") );
	}

}
