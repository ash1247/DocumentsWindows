public class Practice{
	//Student info
	String name;
	int roll;
	void Practice1(String name, int roll)
	{
		this.name  = name;
		this.roll = roll;
	}
	
	void display(){
		System.out.println("The name of the student is " + name);
		System.out.println("The roll ID is " + roll);
	}
	
	public static void main(String [] args){
		
		Practice st1 = new Practice();
		//System.out.println(st1.name);
		Practice st2 = new Practice();
		//System.out.println(st1);
		Practice st3 = new Practice();
		//Practice st2 = st1;
		
		st1.name = "Ashikul Hosen.";
		st1.roll = 16701060;
		
		st2.name = "Shafayet Ahmed.";
		st2.roll = 16701064;
		
		st3.name = "niramish.";
		st3.roll = 16701070;
	    //st1 = null;
		
		st1.display();
		st2.display();
		st3.display();
	}
}