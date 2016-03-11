package base;

public class InsufficientFundsException extends Exception {

	private int accountNumber;
	private double overdrawAmount;
	public InsufficientFundsException(int accountNumber, double overdrawAmount) {
		super();
		this.accountNumber = accountNumber;
		this.overdrawAmount = overdrawAmount;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public double getOverdrawAmount() {
		return overdrawAmount;
	}
	
}
