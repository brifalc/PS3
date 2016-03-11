package base;
import java.util.Date;

public class Account {

	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	public Account(){
		
	}
	
	public Account(int id, double balance, double annualInterestRate, Date dateCreated) {
		super();
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		this.dateCreated = dateCreated;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	
	public double getMonthlyInterestRate() {
		return annualInterestRate/12;
	}
	
	public void withdraw(double amtWithdraw) throws InsufficientFundsException {
		if (amtWithdraw > balance){
			throw new InsufficientFundsException(id,(amtWithdraw-balance));
		}
		
		
		balance -= amtWithdraw;
	}
	public void deposit(double amtDeposit) {
		balance += amtDeposit;
	}
		
}
