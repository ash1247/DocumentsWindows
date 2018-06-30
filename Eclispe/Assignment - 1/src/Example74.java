//Example 7.4
//Program on use of enhanced looping

import java.util.ArrayList;
import java.util.Scanner;


public class Example74 {
	public static void main(String [] args)
	{
		System.out.println();
		String states[] = {"TamilNadu", "AndhraPradesh", "UttarPradesh", "Rajasthan"};
		
		for(int i = 0; i < states.length; i++)
		{
			System.out.println("Standard for-loop : state name : " +states[i]);
		}
		System.out.println();
		for(String i:states)
		{
			System.out.println("Enchanced for-loop : state name : " + i);
		}
		System.out.println();
		
		ArrayList<String> cities = new ArrayList<String>();
			cities.add("Delhi");
			cities.add("Mumbai");
			cities.add("Calcutta");
			cities.add("Chennai");
			System.out.println();
		for(int i = 0; i < cities.size(); i++ )
		{
		  System.out.println("Standard for-loop : city name : " +cities.get(i));
		}
		System.out.println();
		      for (String city : cities)
		  System.out.println("Enchanced for-loop : city name  :  " +city);
		
		System.out.println();
		System.out.println("In Collections");
		System.out.println();
		
		for (String val : cities)
			System.out.println(val);
	}
}
