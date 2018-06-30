
public interface PartialImplementation {

	void shirt();
	void pants();
	void shari();
}

abstract class man implements PartialImplementation
{
	public void shirt()
	{
		System.out.println( "Wearing shirt ");
	}
	public void pants()
	{
		System.out.println("wearing pant");
	}
}

abstract class women implements PartialImplementation
{
	public void shari()
	{
		System.out.println("wearing shari");
	}
}

