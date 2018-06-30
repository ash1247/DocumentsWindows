//Exercise 7.10(c)
//Equilateral Number Triangle
import java.util.Scanner;

public class Excercise710c {
	
	public static void main(String [] args){
			
			int i , j , size;
			
			Scanner input = new Scanner(System.in);
			
			System.out.print("Please enter the number of how many rows of a triangle you want: ");
			size = input.nextInt();
			
			int space = size - 1;
			
			for ( i = 1; i <= size ; i++){
				
				for ( j = space; j >= 1 ; j--){
				
					System.out.print(" ");
				}
					for (j = 1; j <= i; j++){
						
						System.out.print(i+ " ");
						}
					
					System.out.println();
					space = space - 1;
					
				}
			
			}
			
		}



