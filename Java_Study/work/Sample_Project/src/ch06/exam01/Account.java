package ch06.exam01;

public class Account {
	final static int MIN_BALANCE = 0;
	final static int MAX_BALANCE = 1000000;
	
	private int balance = 0;
	final private String account_number;
	final private String name;
	
	Account(String account_number, String name, int balance) {
		this.account_number = account_number;
		this.name = name;
		setBalance(balance);
	}
	
	void setBalance(int balance) {
		if (balance >= MIN_BALANCE && balance <= MAX_BALANCE) {
			this.balance = balance;
		}
	}
	
	int getBalance() {
		return this.balance;
	}
	
	String getName() {
		return this.name;
	}
	
	String getAccount_Number() {
		return this.account_number;
	}
	
}
