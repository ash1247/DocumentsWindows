
public class Construcor_Exchange {

		String name;
		int roll;
		
		void Constructor(String name, int roll)
		{
			this.name  = name;
			this.roll = roll;
		}
		
		void displayMessage()
		{
			System.out.printf("name: ", name);
			System.out.printf("roll: ", roll);
			
		}
		
		public static void main(String [] args)
		{
			Construcor_Exchange s1 = new Construcor_Exchange ();
			s1.displayMessage();
		}
		
}	