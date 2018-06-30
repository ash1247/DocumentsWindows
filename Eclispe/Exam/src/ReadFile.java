//Link List

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;
import java.io.*;


public class ReadFile{
	public static void main(String args[]) throws IOException{
		Scanner scan = new Scanner(System.in);
		FileReader fr = new FileReader("C:\\Users\\ASUS\\Documents\\Eclispe\\Exam\\src\\Info.txt");
		BufferedReader br = new BufferedReader(fr);
		String st;
		String s = " ";
		int i=0;
		
		while( (st = br.readLine()) != null){
			 s += st;
			 s += " ";
		}
		String[] a = s.split("\\s");;
		

	}
}
