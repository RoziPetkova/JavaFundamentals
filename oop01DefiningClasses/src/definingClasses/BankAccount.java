package definingClasses;

public class BankAccount {

	// Fields
	int id;
	double balance;
	private final static double DEFAULT_RATE = 0.02;
	private static double rate = DEFAULT_RATE;
	private static int bankAccountCount;

	public BankAccount() {
		this.id = ++bankAccountCount;
	}

	public BankAccount(int id) {
		this.id = id;
	}

	public int getId() {
		return this.id;
	}

	public double getbalance() {
		return this.balance;
	}

	public void setID(int id) {
		this.id = id;
	}

	public void setBalance(Double ammound) {
		this.balance = ammound;
	}

	public static void setRate(double rate) {
		BankAccount.rate = rate;
	}

	public void deposit(double ammound) {
		if (ammound > 0)
			this.balance += ammound;
	}

	public void withdraw(double ammound) {
		if (this.balance - ammound >= 0)
			this.balance -= ammound;
	}

	public double getInterest(int years) {
		return this.balance * rate * years;
	}


	@Override
	public String toString() {
		return "ID" + this.id;
	}
}
