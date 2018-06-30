public class Practice34
{
	public static void main(String[] args)
	{
		Cathedral c = new Cathedral();
		Cathedral.Sanctum s = c.new Sanctum();
		s.go();
	}
}

class Cathedral
{
	class Sanctum
	{
		void go()
		{
			System.out.println("Spooky");
		}
	}
}