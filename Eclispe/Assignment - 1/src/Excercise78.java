//Exercise 7.8
//Program on fibonnaci number where user can give input on how many fibonacci number they want.
import java.util.Scanner;
public class Excercise78 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 
		 int m = 0;
	     int previousValue = 1;
	     int previousPreviousValue = 0;
	     int n = 0;
	     System.out.println("How many fibonnaci numbers do you want?");
	     m = input.nextInt();
	     
	     do{
	         int currentValue = previousValue + previousPreviousValue;
	         
	         previousPreviousValue = previousValue;
	         
	         previousValue = currentValue;
	         
	         System.out.print(currentValue+" ");
	         
	         n++;
	         
	     }while(n<=m);


	}
}