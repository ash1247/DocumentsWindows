//Exercise 7.6
//Program on factorial where user can input the number of which they want to be factorialed.
import java.util.Scanner;
public class Excercise76 {

	public static void main(String[] args) {
		  	  Scanner input = new Scanner(System.in);
		  	  int i,fact=1;  
			  int m=0;
		  	  System.out.print("Please enter an integer: ");
		  	  m = input.nextInt();
			     
			  for(i=1; i <= m;i++){    
			      fact=fact*i;    
			  }    
			  System.out.printf("Factorial of  %d  is: %d", m , fact);    
			 }  
			

	

}
