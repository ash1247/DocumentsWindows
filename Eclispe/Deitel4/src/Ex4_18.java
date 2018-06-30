/***********************************************************************
 * Credits Limit Calculator
 * @Ashikul Hosen
 * email: sagor.ashikul@gmail.com
 * version 1.0
 ***********************************************************************/
import java.util.Scanner;

public class Ex4_18 {

	    int accountNo, startBalance, totalCharges, totalCredits, creditLimit;

	    // SETTERS
	    public void setAccountInfo(int accountNo, int startBalance, int totalCharges,
	                               int totalCredits, int creditLimit)
	    {
	        setAccountNo(accountNo);
	        setStartBalance(startBalance);
	        setTotalCharges(totalCharges);
	        setTotalCredits(totalCredits);
	        setCreditLimit(creditLimit);
	    }
	    public void setAccountNo(int accountNo)
	    {
	        this.accountNo = accountNo;
	    }
	    public void setStartBalance(int startBalance)
	    {
	        this.startBalance = startBalance;
	    }
	    public void setTotalCharges(int totalCharges)
	    {
	        this.totalCharges = totalCharges;
	    }
	    public void setTotalCredits(int totalCredits)
	    {
	        this.totalCredits = totalCredits;
	    }
	    public void setCreditLimit(int creditLimit)
	    {
	        this.creditLimit = creditLimit;
	    }
	    // GETTERS
	    public int getAccountNo()
	    {
	        return accountNo;
	    }
	    public int getStartBalance()
	    {
	        return startBalance;
	    }
	    public int getCreditLimit()
	    {
	        return creditLimit;
	    }
	    public int getTotalCharges()
	    {
	        return totalCharges;
	    }
	    public int getTotalCredits()
	    {
	        return totalCredits;
	    }
	    public int getNewBalance()
	    {
	        return getStartBalance() - getTotalCharges() + getTotalCredits();
	    }
		
	    public boolean creditExceeded()
	    {
	        return (getNewBalance() > getCreditLimit()) ? false : true;
	    }
		
	public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        Ex4_18 creditCalculator = new Ex4_18();

        int accNo, startBalance, chargesTotal, creditsTotal, creditLimit;
        char cont = 'y';
        String separator = "\n********************\n";

        while(cont != 'n'){
            System.out.println(separator);
            System.out.print("Enter customer account number: ");
            accNo = sc.nextInt();

            startBalance = requestInput("Enter start balance for account " + accNo + ": ", sc);
            chargesTotal = requestInput("Enter total monthly charges for account " + accNo + ": ", sc);
            creditsTotal = requestInput("Enter total monthly credits for account " + accNo + ": ", sc);
            creditLimit = requestInput("Enter credit limit for account " + accNo + ": ", sc);

            creditCalculator.setAccountInfo(accNo, startBalance,
                    chargesTotal, creditsTotal, creditLimit);

            System.out.println(separator);
            System.out.printf("CREDIT INFORMATION FOR ACCOUNT %d\n", accNo);

            System.out.printf("Starting balance: %d\n", creditCalculator.getStartBalance());
            System.out.printf("Credit Limit: %d\n", creditCalculator.getCreditLimit());
            System.out.printf("Total Charges: %d\n", creditCalculator.getTotalCharges());
            System.out.printf("Total Credits: %d\n", creditCalculator.getTotalCredits());
            System.out.printf("New Balance: %d\n", creditCalculator.getNewBalance());

            if(creditCalculator.creditExceeded())
                System.out.println("Credit limit exceeded.");

            // continue
            System.out.print("Calculate credit for another account? (y/n): ");
            cont = sc.next().charAt(0);
        }
    }
    public static int requestInput(String s, Scanner sc){
        System.out.print(s);
        return sc.nextInt();
    }
	
}