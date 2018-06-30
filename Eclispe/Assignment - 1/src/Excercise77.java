//Excercise 7.7
//A program to to compute sum of digits of a given integer

import java.util.Scanner;

public class Excercise77 {
	public static void main(String[] args) {
         int num = 0;
         int sum = 0;
     
         Scanner input = new Scanner(System.in);
		 
         System.out.println("Please enter an integer: ");
         num = input.nextInt();
         
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        System.out.println(sum);
    }
}
