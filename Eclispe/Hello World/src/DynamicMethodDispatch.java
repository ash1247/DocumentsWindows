
public class DynamicMethodDispatch {
	public static void main(String args[]) 
	{ 
		Super A=new Sub(); 
		A.method(); 
	} 
}

class Super
{ 
	public void method() 
	{ 
		System.out.println("Method super"); 
	} 
} 

class Sub extends Super 
{ 
	int j=5; public void method() 
	{ 
		System.out.println("method sub"); 
	} 
}  
 
	