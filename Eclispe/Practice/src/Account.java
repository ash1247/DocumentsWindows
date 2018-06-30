public class Account {
	
	private double balance;
	private double debit;
	
	public Account(double initialBalance)
	{
		if ( initialBalance > 0.0)
		{
			balance = initialBalance;
		}
	}
		public void setCredit(double amount)
		{
			balance = balance + amount;
		}
		
		
		public void setDebit(double deb)
		{
			debit = balance - deb;
		
			if ( deb > balance  )
			{
			System.out.println("Debit amount exceeded account balance.");
			debit = deb + debit;
			}
			
		}
		
		public double getBalance()
		{
			return balance;
		}
		
		public double getDebit()
		{
			return debit;
		}
}

