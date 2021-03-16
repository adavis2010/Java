package banking;

public class SavingsComposition {
	
	public SavingsComposition() {
		this("New Savings Account");
		//default constructor
		
	}

	public SavingsComposition(String Description) {
		account = new Account(Description);
	} //Constructor with one parameter

	  private Account account = null; 
	    //displaying property (Balance) from account.
	  private double interestRate = 0.12;


    public double getIntRate() {
		{return interestRate;}
	}
	public void setInterestRate(double intRate) {
		{ this.interestRate = intRate;}
	}
	public void transfer (Account toAccount, double amount) throws Exception {
		account.Transfer(toAccount, amount);;
	}
	private void setAccount(Account account) {
		this.account = account;
	}
	private double getBalance() {
		{ return account.getBalance();}
	}
	

    private double Interest(int months ) {
        return account.Balance * (interestRate / 12) * months;
    }
    
    public void payInterest(int months) throws Exception {
        double interest =  getBalance() * (interestRate/ 12) * months;
        deposit(interest);
    }

    public void deposit(double amount) throws Exception {
        account.Deposit(amount);
    }

    public void withdrawal(double amount) throws Exception {
        account.Withdrawal(amount);
    }


}
    







