package ch06.exam01;

import java.util.Scanner;

public class BankApplication {
	Scanner scanner = new Scanner(System.in);
	Account[] accounts = new Account[100];
	
	private int count = 0;
	
	int getCounts() {
		return count;
	}
	
	int getModeFromUser() {
		System.out.println("-------------------------------");
		System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
		System.out.println("-------------------------------");
		
		System.out.print("선택> ");
		int mode = scanner.nextInt(); scanner.nextLine();
		// Scanner.nextInt메소드가 사용자가 입력한 enter(개행문자)를 제거하지 않기 때문에 다음 nextLine()이 바로 개행으로 입력되어버린다.
		return mode;
	}
	
	void insertAccount(Account account) {
		accounts[count++] = account;
	}
	
	Account getAccount(int i) {
		return accounts[i];
	}
	
	void printMode(String mode) {
		System.out.println("------");
		System.out.printf("%s\n",mode);
		System.out.println("------");
	}
	
	Account CreateAccount() {
		String account_number, name;
		int initial_deposit;
		
		printMode("계좌생성");

		System.out.print("계좌번호: ");
		account_number = scanner.nextLine();

		System.out.print("계좌주: ");
		name = scanner.nextLine();
		
		System.out.print("초기입금액: ");
		initial_deposit = scanner.nextInt();
		
		Account account = new Account(account_number, name, initial_deposit);
		System.out.println("결과: 계좌가 생성되었습니다.");
		return account;
	}
	
	int getIndexByAccountNumber(String account_number) {
		
		for(int i=0; i<count; i++) {
			if(accounts[i].getAccount_Number().equals(account_number)) {
				return i;
			}
		}
		return -1;
	}
	
	
	
	void Deposit() {
		String account_number;
		int deposit, balance, index;
		
		printMode("예금");
		
		System.out.print("계좌번호> ");
		account_number = scanner.nextLine();
		
		System.out.print("예금액> ");
		deposit = scanner.nextInt(); scanner.nextLine();
		
		index = getIndexByAccountNumber(account_number);
		balance = accounts[index].getBalance() + deposit;
		accounts[index].setBalance(deposit);
	}
	
	void withdraw() {
		String account_number;
		int amount;
		
		printMode("출금");
		
		System.out.print("계좌번호> ");
		account_number = scanner.nextLine();
		
		System.out.print("출금액> ");
		amount = scanner.nextInt(); scanner.nextLine();
		
		for(int i=0; i<count; i++) {
			if(accounts[i].getAccount_Number().equals(account_number)) {
				accounts[i].setBalance(accounts[i].getBalance() - amount); 
			}
		}
	}
	void getAccounts() {
		System.out.println("------");
		System.out.println("계좌목록");
		System.out.println("------");
		
		for(int i=0; i<count; i++) {
			String account_number = accounts[i].getAccount_Number();
			String name = accounts[i].getName();
			int balance = accounts[i].getBalance();
			System.out.printf("%7s %7s %10d\n", account_number, name, balance);
		}
	}
	
}
