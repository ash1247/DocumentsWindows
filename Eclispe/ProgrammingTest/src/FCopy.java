import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Scanner;

public class FCopy {
	
	public static void main(String[] args) throws IOException
		{
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ASUS\\Desktop\\New Text Document (3).txt") );
		BufferedWriter br2 = new BufferedWriter(new FileWriter("C:\\Users\\ASUS\\Desktop\\New Text Document (3).txt") );
		FileChannel src = new FileInputStream("C:\\Users\\ASUS\\Desktop\\New Text Document (3).txt").getChannel();
		FileChannel dest = new FileOutputStream("C:\\Users\\ASUS\\Desktop\\New Text Document (4).txt").getChannel();
				
		StringBuilder sb = new StringBuilder();
		String str;
		Scanner input = new Scanner(System.in);
				
		try {
			str = input.nextLine();
			while( !str.equals("null") ) 
			{
				sb.append(str);
				sb.append(System.lineSeparator() );
				str = input.nextLine();
			}
				
			String eve = sb.toString();
			br2.write(eve);
					
			}
				
		finally {
			br2.close();
		}
				
		try {
					
			String line = br.readLine();
					
				while(line != null) {
					line = br.readLine();
				}
			String everything = sb.toString();
			System.out.println(everything);
			
			}
		finally {
			br.close();
		}
		dest.transferFrom(src, 0, src.size());
	}	
}
