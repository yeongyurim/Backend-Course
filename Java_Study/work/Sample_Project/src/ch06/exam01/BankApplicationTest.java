package ch06.exam01;

import java.util.Scanner;

public class BankApplicationTest {

	public static void main(String[] args) {
		BankApplication bankApp = new BankApplication();
		
		int mode = 0;
		
		do {
			mode = bankApp.getModeFromUser();
			
			switch (mode) {
				case 1 -> {
					Account newAccount = bankApp.CreateAccount();
					bankApp.insertAccount(newAccount);
				}
				case 2 -> {
					bankApp.getAccounts();
				}
				case 3 -> {
					bankApp.Deposit();
				}
				case 4 -> {
					bankApp.withdraw();
				}
			}
		} while(mode != 5);
		System.out.println();
		System.out.println("프로그램 종료");
	}

}
