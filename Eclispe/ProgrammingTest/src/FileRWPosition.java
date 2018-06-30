import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileRWPosition {
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader reader = null;
		BufferedWriter writer = null;
		ArrayList<String> list = new ArrayList<String>();

		try {
		    reader = new BufferedReader(new FileReader("C:\\Users\\ASUS\\Desktop\\New Text Document (4).txt"));
		    String tmp;
		    while ((tmp = reader.readLine()) != null)
		    list.add(tmp);
		    reader.close();

		    list.add(0, "Start Text");
		    list.add("End Text");

		    writer = new BufferedWriter(new FileWriter("C:\\Users\\ASUS\\Desktop\\New Text Document (4).txt"));
		    for (int i = 0; i < list.size(); i++)
		        writer.write(list.get(i) + "\r\n");
		} catch (Exception e) {
		    e.printStackTrace();
		} finally {
		    reader.close();
		    writer.close();
		}
	}
}
