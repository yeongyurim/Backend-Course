package am;

import java.util.Scanner;

public class IfTest9 {

	public static void main(String[] args) {
		// 화면에 정수입력 문자열 출력
		System.out.println("점수: ");
		Scanner scanner = new Scanner(System.in);
		
		int score = scanner.nextInt();
		
		// 받은 score값이 100초과는 "잘못된 값"이라고 출력
		// 그렇지 않고 100~60 사이면 "합격" 출력!
		// 그것도 아니면 "다음 기회에" 출력!
		
		if(score> 100) {
			System.out.println("잘못된 값");
		} else if(score >= 60) {
			System.out.println("합격!");
		} else {
			// 제어가 이쪽에 왔을 때는 score에 최댓값은 100이다.
			// 그러므로 자연스럽게 범위가 지정된다. 100~60
			System.out.println("다음기회에!");
		}
	}

}
