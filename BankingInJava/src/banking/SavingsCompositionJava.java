package banking;

public class SavingsCompositionJava<Balance> {




    private double getInterestRate() {
		return InterestRate;
	}
	private void setInterestRate(double interestRate) {
		InterestRate = interestRate;
	}
	private Account getAccount() {
		return account;
	}
	private void setAccount(Account account) {
		this.account = account;
	}
	private double getBalance() {
		return balance;
	}
	private void setBalance(double balance) {
		Balance = balance;
	}


	public double InterestRate = 0.12;

    //Calculate Interest (could change public to private on Interest... in which I did
    private double Interest(int months ) {
        return account.Balance * (InterestRate / 12) * months;
    }
    //adding method to deposit interest
    public void PayInterest(int months) {
        var interest = Interest(months);
        Deposit(interest);
    }


    public Account account; 
    //displaying property (Balance) from account. 
    

    public void Deposit(double amount); {
        account.Deposit(amount);
    }

    public void Withdrawal(double amount); {
        account.Withdrawal(amount);
    }


    public SavingsCompositionJava() {
        // adding two parameters..("4","Savings Account"); 
        this.account = new Account("4","Savings Account");       
    }
    
    







}