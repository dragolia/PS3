package Base;

import static org.junit.Assert.*;

import org.junit.Test;

import Base.Account;

public class accountTest {

	@Test
	public void Withdraw_Test(){
		Account balance = new Account(1122, 20000); 
		assertEquals(balance.Withdraw(2500), 17500, .01);
	}
	@Test
	public void Deposit_Test(){
		Account balance = new Account(1122, 20000); 
		assertEquals(balance.Deposit(3000), 23000, .01);
	}
	@Test
	public void Account_Test(){
		Account balance = new Account(1122, 20000);
		assertEquals(balance.Withdraw(2500), 17500, .01);
		assertEquals(balance.Deposit(3000), 20500, .01);
		assertEquals(balance.getMonthlyIntrestRate(4.5),.375,.01);
		System.out.println(  balance.getBalance());
		System.out.println(  balance.getMonthlyIntrestRate(4.5) );
		System.out.println( balance.getDateCreate() );
	}
	@Test
	public void insufficient_Test(){
		Account balance = new Account(1122, 2000);
		assertEquals(balance.Withdraw(2500), -500, .01);
	}

}
