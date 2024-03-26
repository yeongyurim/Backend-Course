package am;

import java.util.Scanner;

public class IfTest8 {

	public static void main(String[] args) {
		// 키보드로 부터 정수를 하나 받는다.
		// 그 값이 60이상이면 "합격"을 출력하고 그렇지 않다면
		// "다음기회에"를 출력하세요!
		System.out.println("정수 입력: ");
		
		Scanner scanner = new Scanner(System.in);
		
		int score = scanner.nextInt();
		
		if (score >= 60) {
			System.out.println("합격!");
		} else {
			System.out.println("다음기회에!");
		}

	}

}
