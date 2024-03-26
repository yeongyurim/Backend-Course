package ch03.exam;

import java.util.Scanner;

public class BankManager {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int mode = 0, deposit = 0;
		
		while (mode != 4) {
			System.out.println("-------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("-------------------------------");
			
			System.out.print("선택> ");
			mode = scanner.nextInt();
			
			switch (mode) {
				case 1 -> {
					System.out.print("예금액> ");
					deposit = scanner.nextInt();
				}
				case 2 -> {
					System.out.println("출금액> ");
					deposit = scanner.nextInt();
				}
				case 3 -> {
					System.out.println("잔고> ");
					deposit = scanner.nextInt();
				}
			}
		}
		System.out.println();
		System.out.println("프로그램 종료");
	}

}
