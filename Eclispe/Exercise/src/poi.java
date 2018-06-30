import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;

public class poi
{
	static FileWriter fileWriter;
	static Formatter formatter;
	static Scanner scanner;
	
	public static void main(String [] args) throws IOException
	{
		fileWriter = new FileWriter("text.txt");
		formatter =  new Formatter(fileWriter);
		
		formatter.format("%s \n", "This is shit");
		formatter.format("%s \n", "This is shit2");
		formatter.close();
		
		scanner = new Scanner( new File("text.txt") );
		
	
		while(scanner.hasNext() )
		{
			String sen = scanner.next();
			System.out.println(sen);
		}
		
	}
}