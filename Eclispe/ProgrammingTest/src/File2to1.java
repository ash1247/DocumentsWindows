import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File2to1 {

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ASUS\\Desktop\\New Text Document (3).txt") );
		BufferedReader br2 = new BufferedReader(new FileReader("C:\\Users\\ASUS\\Desktop\\New Text Document.txt") );
		BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\ASUS\\Desktop\\New Text Document (4).txt") );
		StringBuilder sb = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
	
		
		try {
			
			String line = br.readLine();
			String line2 = br2.readLine();
					
				while(line != null) {
					sb.append(line);
					sb.append(System.lineSeparator() );
					line = br.readLine();
				}
				while(line2 != null) {
					sb2.append(line2);
					sb2.append(System.lineSeparator() );
					line2 = br2.readLine();
				}
			String everything = sb.toString();
			String everything2 = sb2.toString();	
				
			bw.write(everything);
			bw.write(everything2);
			
			
			}
		finally {
			br.close();
			br2.close();
			bw.close();
		}
	}
}
