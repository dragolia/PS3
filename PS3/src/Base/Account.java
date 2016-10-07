package Base;
import java.util.Date;

public class Account {
	private int id;
	private double balance;
	private double anualIntrestRate;
	private Date dateCreate;
	
	public Account() {
		super();
	}

	public Account(int id, double balance) {
		super();
		this.id = id;
		this.balance = balance;
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

	public double getAnualIntrestRate() {
		return anualIntrestRate;
	}

	public void setAnualIntrestRate(double anualIntrestRate) {
		this.anualIntrestRate = anualIntrestRate;
	}

	public Date getDateCreate() {
		return dateCreate;
	}
	public double getMonthlyIntrestRate( double intrest){
		double monthly=intrest/12;
		return monthly;
	}
	public double Withdraw(double amount){
		balance -= amount;
		return balance;
		
	}
	public double Deposit(double amount){
		balance += amount;
		return balance;
	}
	


}
