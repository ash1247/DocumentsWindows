import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Scanner;

public class FileList {
	
	FileWriter fileWriter;
	Formatter formatter;
	Scanner scanner;
	File file;
	
	public void openFormatter(boolean append) throws IOException
	{
		fileWriter = new FileWriter("Number.txt", append);
		formatter = new Formatter(fileWriter);
		scanner = new Scanner(new File("number.txt") );
	}
	
	public void addNumber() throws IOException
	{
		openFormatter(false);
		
		for(int count = 1; count <= 100; count++)
		{
			formatter.format("%d ", count);
		}
		formatter.close();
	}
	
	public void getUserData() throws IOException{
		
		openFormatter(true);	
		ArrayList <Integer> allNum = new ArrayList<Integer>();
		while(scanner.hasNext() ){
			
			int data = scanner.nextInt();
			allNum.add(data);
		}	
		System.out.println("All the numbers from 1 - 100");
		System.out.println(allNum);
		
		System.out.println();
		System.out.println("Only Even");
	
		for (Iterator<Integer> iterator = allNum.iterator(); iterator.hasNext();) {
		    Integer number = iterator.next();
		    if (number % 2 != 0) 
		    {
		    	iterator.remove();
		        allNum.remove(number);
		    }
		}	
		System.out.println(allNum);
	}
	
	public static void main(String[] args) throws IOException
	{
		FileList fl = new FileList();
		fl.addNumber();
		fl.getUserData();
	}
}


