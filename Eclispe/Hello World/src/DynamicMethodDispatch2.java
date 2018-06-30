
public class DynamicMethodDispatch2 {
	
	public static void main( String[] args)
	{
		A1 a = new A1();
		B1 b = new B1();
		C1 c = new C1();
		A1 r;
		
		r = a;
		r.callme();
		
		r = b;
		r.callme();
		
		r = c;
		r.callme();
	}
}

class A1 {
	void callme()
	{
		System.out.println("Inside A's calltime method");
	}
}

class B1 extends A1 {
	void callme()
	{
		System.out.println("Inside A's calltime method");
	}
}

class C1 extends A1 {
	void callme()
	{
		System.out.println("Inside A's calltime method");
	}
}