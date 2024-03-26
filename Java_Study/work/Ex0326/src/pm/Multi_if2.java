package pm;

import java.util.Scanner;

public class Multi_if2 {

	public static void main(String[] args) {
		// 프로그램 시작
		
		/*
		 * [믄제]
		 * 키보드로부터 점수 하나를 입력받는다.(0~200)
		 * 그 점수가 80~100 사이면 "우수"출력!,
		 * 그렇지 않고 60~79 사이면 "보통"출력!,
		 * 그것도 아니고 40~59 사이면 "재시험"출력!
		 * 그 이하는 하지마~!" 출력 
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수 > ");
		int score = scanner.nextInt();
		
		if (score <= 100 || score >= 0) {
			System.out.println("0~100까지의 수들 중 하나를 입력하세요!");
		} else if (score >= 80) {
			System.out.println("우수");
		} else if (score >= 60) {
			System.out.println("보통");
		} else if (score >= 40) {
			System.out.println("재시험");
		} else {
			System.out.println("하지마~!");
		}
	}

}
