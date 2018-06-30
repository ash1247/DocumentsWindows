
public class OverridingAndHidingMethod extends Animal {
	
	public static void testClassMethod()
	{
		System.out.println("The static method in Cat");
	}
	
	public void testInstanceMethod()
	{
		System.out.println("The Instance method in Cat");
	}
	
	public static void main( String[] args)
	{
		OverridingAndHidingMethod myCat = new OverridingAndHidingMethod();
		Animal myAnimal = myCat;
		Animal.testClassMethod();
		myAnimal.testInstanceMethod();
	}

}
