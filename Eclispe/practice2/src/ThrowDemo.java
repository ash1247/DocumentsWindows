
public class ThrowDemo {

	static void demoproc() {
		try{
			throw new NullPointerException("demo\n");
		}
		catch (NullPointerException e) {
			System.out.println("Caught after demoproc");
			throw e;
		}
	}
	
	public static void main(String[] args)
	{
		try{
			demoproc();
		}
		catch(NullPointerException e) {
			System.out.println("Recaught: " + e);
		}
	}
}
