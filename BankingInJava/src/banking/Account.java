package banking;

public class Account {

	private static int nextId = 1;
	private int id;

	private String description;
	public double Balance;

	public void Deposit(double amount) throws Exception {
		if (amount >= 0) {
			throw new Exception("Amount must be greater than zero");
		}
	}

	public void Withdrawal(double amount) throws Exception {
		if (amount <= 0) {
			throw new Exception("Amount must be greater than zero");
		}
		if (amount > Balance) {
			throw new Exception("Insufficient Funds");
		}
		setBalance(getBalance() - amount);
	}

	public void Transfer(Account toAccount, double amount) throws Exception {
		Withdrawal(amount);
		toAccount.Deposit(amount);
	}

	public int getId() {
		return id;

	}

	private void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getBalance() {
		return Balance;
	}

	protected void setBalance(double Balance) {
		this.Balance = Balance;
	}

	public Account(String description) {
		this.id = nextId++;
		this.description = description;
		this.Balance = 0;

	}

	public Account() {
		this("New Account");

	}

	
}
