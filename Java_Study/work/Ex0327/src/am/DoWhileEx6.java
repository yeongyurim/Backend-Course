package am;

import java.util.Scanner;

public class DoWhileEx6 {

	public static void main(String[] args) {
		// 키보드로 부터 단을 입력받습니다.
		System.out.print("단을 입력해주세요> ");
		Scanner scanner = new Scanner(System.in);
		
		// 키보드로부터 단을 입력받기 위해 준비 (Scanner)
		int dan = scanner.nextInt();
		int i = 1;
		
		do {
			System.out.printf("%-2d*%2d =%3d\n", dan,i,dan*i++);
		} while (i<10);
	}

}
