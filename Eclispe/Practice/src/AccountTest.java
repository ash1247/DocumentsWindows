import java.util.Scanner;
public class AccountTest {
	public static void main (String[] args)
	{
		Account account1 = new Account( 50.00);
		Account account2 = new Account( -7.53);
		
		System.out.printf("Account 1 balance: %.2f\n", account1.getBalance() );
		System.out.printf("Account 2 balance: %.2f\n\n", account2.getBalance() );
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		double depositAmount;
		double debitU;
		
		System.out.print("Enter deposit amount account 1: ");
		depositAmount = input.nextDouble();
		System.out.printf("\nadding %.2f to account 1 balance\n\n", depositAmount);
		account1.setCredit( depositAmount);
		 
		System.out.printf("Account 1 balance: %.2f\n", account1.getBalance() );
		System.out.printf("Account 2 balance: %.2f\n\n", account2.getBalance() );
		
		System.out.print("Enter deposit amount for Account 2: ");
		depositAmount = input.nextDouble();
		System.out.printf("\nadding %.2f to account 2 balance\n\n", depositAmount );
		account2.setCredit(depositAmount);
		
		System.out.printf("Account 1 balance: $%.2f\n", account1.getBalance() );
		System.out.printf("Account 2 balance: $%.2f\n", account2.getBalance() );
		
		System.out.print("Enter debit for account 1: ");
		debitU = input.nextDouble();
		System.out.printf("\ntaking %.2f from account 1 balance\n\n", debitU);
		account1.setDebit( debitU);
		 
		System.out.printf("Account 1 balance: %.2f\n", account1.getDebit() );
		System.out.printf("Account 2 balance: %.2f\n\n", account2.getDebit() );
		
		System.out.print("Enter debit for Account 2: ");
		debitU = input.nextDouble();
		System.out.printf("\ntaking %.2f from account 2 balance\n\n", debitU );
		account2.setDebit(debitU);
		
		System.out.printf("Account 1 balance: %.2f\n", account1.getDebit() );
		System.out.printf("Account 2 balance: %.2f\n\n", account2.getDebit() );
		

		
	}

}
