package pm;

import java.util.Scanner;

public class Switch3 {

	public static void main(String[] args) {
		// 프로그램 시작
		
		// 화면에 정수입력 문장 출력
		System.out.println("입력(1~3):");
		
		// 키보드와 연결된 스캐너 준비
		Scanner scanner = new Scanner(System.in);

		// 정수 하나 받기
		int su = scanner.nextInt();
		
		// 범위 비교를 수행할때는 if문이 강하다.
		if(su == 1) {
			System.out.println("1번");
		} else if(su == 2) {
			System.out.println("2번");
		} else if(su == 3) {
			System.out.println("3번");
		}
		/*
		 *  switch문의 구성
		 *  switch(조건값) {
		 *  case 비굣값1 :
		 *  	실행문1;
		 *  	실행문2;
		 *  	break; // switch문 탈출
		 *  case 비굣값2 :
		 *  	실행문3;
		 *  	실행문4;
		 *  	break;
		 *  case 비굣값n :
		 *  	실행문n;
		 *  	...
		 *  	break; // switch문 탈출
		 *  default
		 */
		
		// 같은 값을 찾아갈때는 switch문이 강하다
		switch(su) {
		case 1:
			System.out.println("1번");
			break;
			
		case 3:
			System.out.println("3번");
			break;
			
		case 2:
			System.out.println("2번");
			break;
			
		}
	}

}
