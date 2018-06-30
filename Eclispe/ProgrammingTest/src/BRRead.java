import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRRead {
	
	public static void main(String args[]) throws IOException
	{
		String str;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter line of text.");
		System.out.println("Enter 'stop' to quit.");
		
		do {
			str = br.readLine();
			System.out.println(str);
			} 
		while(!str.equals("stop"));
	}
}


